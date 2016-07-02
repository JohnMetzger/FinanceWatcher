package collection.accountBalance

import java.util.Calendar

import model.account.Account
import model.accountbalance.AccountBalance

import scala.collection.mutable

class AccountBalanceCollection(account: Account) {

  //val this.account: Account = account
  var balances: List[AccountBalance] = AccountBalanceCollection.getSomeAccountBalances(account)

  def addAccountBalance(accountBalance: AccountBalance): Unit = {
    balances = accountBalance :: balances
  }
}

object AccountBalanceCollection {

  def getSomeAccountBalances(account: Account): List[AccountBalance] = {

    val balanceList: mutable.ListBuffer[AccountBalance] = mutable.ListBuffer()

    for (x <- (1 to 5).toList) {
      balanceList += AccountBalance(x * 145.67, "MyAccount", Calendar.getInstance())
    }

    balanceList.toList

  }
}