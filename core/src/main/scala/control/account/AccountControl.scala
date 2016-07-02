package control.account

import manager.accountbalance.AccountBalanceManager
import model.account.Account

class AccountControl {


}


object AccountControl {

  def getAccountBalanceManager(account: Account): AccountBalanceManager = {
    account.balanceManager
  }
}
