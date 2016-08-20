package persistence.dbConnection.accountBalance

import java.util.Calendar

import model.accountbalance.AccountBalance

class AccountBalancePersistence {
  def get(name: String): AccountBalance = {
    //Transaction(500, "A", "B", Calendar.getInstance(), Calendar.getInstance())
    AccountBalance(1, 500, "TestAccount1", Calendar.getInstance())
  }

  def isValid(name: String, stemp: Integer): Boolean = {
    //TODO Prüfung schreiben
    true
  }
}
