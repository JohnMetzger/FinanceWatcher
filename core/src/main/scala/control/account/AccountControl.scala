package control.account

import control.MainControl
import manager.accountbalance.AccountBalanceManager
import model.account.Account

class AccountControl {



}


object AccountControl {

  def getAccountBalanceManager(account: Account): AccountBalanceManager = {
    account.balanceManager
  }

  def createAccount(name: String, description: String) = {


    MainControl.accountManager.addNewAccount(name, description)

  }

}
