package control.account

import java.util.Calendar

import control.AccountBalanceManager
import model.account.Account
import model.accountbalance.AccountBalance

class AccountControl {


  def getSimpleAccountBalance(account: Account): AccountBalanceManager = {
    AccountBalance(500, "Peter", Calendar.getInstance())
  }
}


object AccountControl {

  def getAccountBalance:

}
