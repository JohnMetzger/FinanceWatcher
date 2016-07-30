package persistence.transaction

import java.util.Calendar

import model.transaction.Transaction

object TransactionPersistence {

  def get(id: Int): Transaction = {
    Transaction(1, 500, "A", "B", Calendar.getInstance(), Calendar.getInstance())
  }

  def isValid(id: Int, stemp: Integer): Boolean = {
    //TODO Prüfung schreiben
    true
  }
}
