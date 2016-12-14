package persistence.dbConnection.accountBalance

import java.util.Calendar

import model.entity.accountbalance.AccountBalance
import org.joda.time.DateTime

class AccountBalancePersistence {
  def get(name: String): AccountBalance = {
    //Transaction(500, "A", "B", Calendar.getInstance(), Calendar.getInstance())
    AccountBalance(1, 500, "TestAccount1", new DateTime())
  }

  def isValid(name: String, stemp: Integer): Boolean = {
    //TODO Prüfung schreiben
    true
  }
}
