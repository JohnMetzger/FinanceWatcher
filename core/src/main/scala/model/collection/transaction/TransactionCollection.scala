package model.collection.transaction

import java.util.Calendar

import model.entity.account.Account
import model.entity.transaction.Transaction

import scala.collection.mutable


class TransactionCollection(account: Account) {
  var transactons: List[Transaction] = TransactionCollection.generateSomeTransactions(account)

}

object TransactionCollection {

  def generateSomeTransactions(account: Account): List[Transaction] = {

    val transactionList: mutable.ListBuffer[Transaction] = mutable.ListBuffer()
    val secondAccount: Account = Account("1", "secondAccount", "Just to Test some shit")

    for (x <- (1 to 5).toList) {
      transactionList += Transaction(x.toString, x * 145.67, account.name, secondAccount.name, Calendar.getInstance(), Calendar.getInstance())
    }

    transactionList.toList
  }
}
