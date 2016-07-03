package manager.accountbalance

import java.util.Calendar

import collection.accountBalance.AccountBalanceCollection
import model.account.Account
import model.accountbalance.AccountBalance

class AccountBalanceManager(account: Account) {

  var currentBalance: AccountBalance = initCurrentBalance

  var balanceCollection: AccountBalanceCollection = initBalanceCollection

  def initBalanceCollection: AccountBalanceCollection = {
    val balanceCollection = new AccountBalanceCollection(account)
    balanceCollection
  }

  def initCurrentBalance: AccountBalance = {
    /* Use FakeData */
    AccountBalance(500, account.name, Calendar.getInstance())
  }


  def addNewAccountBalance(accountBalance: AccountBalance): Unit = {
    if (currentBalance.date.before(accountBalance.date)) {
      currentBalance = accountBalance

      balanceCollection.addAccountBalance(accountBalance)
    }
  }


}


