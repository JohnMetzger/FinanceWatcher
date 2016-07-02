package control

import java.util.Calendar

import collection.accountBalance.AccountBalanceCollection
import model.account.Account
import model.accountbalance.AccountBalance

class AccountBalanceManager(account: Account) {

  val this.account = account
  var currentBalance: AccountBalance = getCurrentBalance()

  var balanceCollection: AccountBalanceCollection = getBalanceCollection()

  def getBalanceCollection(): AccountBalanceCollection = {
    val balanceCollection = new AccountBalanceCollection(account)
    balanceCollection
  }

  def addNewAccountBalance(accountBalance: AccountBalance): Unit = {
    if (currentBalance.date.before(accountBalance.date)) {

    }
  }

  def getCurrentBalance(): AccountBalance = {
    // Just Fake

    AccountBalance(500, account.name, Calendar.getInstance())
  }

}


