package persistence.dbConnection.transaction

import java.util.Calendar

import model.transaction.Transaction

object TransactionPersistence {

  def get(id: String): Transaction = {
    Transaction("1", 500, "A", "B", Calendar.getInstance(), Calendar.getInstance())
  }

  def isValid(id: String, stemp: Integer): Boolean = {
    //TODO Prüfung schreiben
    true
  }
}
