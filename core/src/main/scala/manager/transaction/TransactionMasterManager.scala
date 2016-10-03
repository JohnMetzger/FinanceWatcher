package manager.transaction

import model.transaction.Transaction
import persistence.dbConnection.transaction.TransactionPersistence

import scala.collection.mutable

class TransactionMasterManager {
  var transactions: mutable.Map[String, TransactionEntity] = new mutable.HashMap[String, TransactionEntity]

  def get(transactionID: String): Transaction = {
    if (transactions contains transactionID) {
      val transEntity: TransactionEntity = transactions(transactionID)

      if (!TransactionPersistence.isValid(transEntity.transaction.id, transEntity.stamp)) {
        updateTransaction(transactionID)
      } else {
        transEntity.transaction
      }
    } else {
      updateTransaction(transactionID)
    }
  }

  private def updateTransaction(transactionID: String): Transaction = {
    val transaction = TransactionPersistence.get(transactionID)
    this.addTransaction(transaction)
    transaction
  }

  private def addTransaction(transaction: Transaction): Unit = {
    transactions += (transaction.id -> TransactionEntity(transaction, 0))
  }
}

case class TransactionEntity(transaction: Transaction, stamp: Integer)

