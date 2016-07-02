package control.account

import control.AccountBalanceManager
import model.account.Account

class AccountControl {

}


object AccountControl {

  def getAccountBalanceManager(account: Account): AccountBalanceManager = {
    account.balanceManager
  }
}
