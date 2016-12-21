package model.manager.accountbalance

import model.collection.accountBalance.AccountBalanceCollection
import model.entity.account.Account
import model.entity.accountbalance.AccountBalance
import org.joda.time.DateTime

class AccountBalanceManager(account: Account) {

  var currentBalance: AccountBalance = initCurrentBalance

  var balanceCollection: AccountBalanceCollection = initBalanceCollection

  def initBalanceCollection: AccountBalanceCollection = {
    new AccountBalanceCollection(account)
  }

  private def initCurrentBalance: AccountBalance = {
    /* Use FakeData */
    AccountBalance("1", 531, account.name, new DateTime())
  }

}


