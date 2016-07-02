package control

import collection.accountBalance.AccountBalanceCollection
import model.account.Account
import model.accountbalance.AccountBalance

class AccountBalanceManager(account: Account) {

  var currentBalance: AccountBalance

  var balanceCollection: AccountBalanceCollection

  def getBalanceCollection() = {
    balanceCollection = AccountBalanceCollection(account)
  }

  def addNewAccountBalance(accountBalance: AccountBalance): Unit = {
    if (currentBlance.date < accountBalance.date) {

    }
  }
}


