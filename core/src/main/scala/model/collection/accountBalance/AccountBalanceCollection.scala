package model.collection.accountBalance

import java.util.Calendar

import model.entity.account.Account
import model.entity.accountbalance.AccountBalance
import org.joda.time.DateTime

import scala.collection.mutable

class AccountBalanceCollection(account: Account) {

  var balances: List[AccountBalance] = AccountBalanceCollection.generateSomeAccountBalances(account)

  def add(accountBalance: AccountBalance): Unit = {
    balances = accountBalance :: balances
  }
}

object AccountBalanceCollection {

  def generateSomeAccountBalances(account: Account): List[AccountBalance] = {
    val balanceList: mutable.ListBuffer[AccountBalance] = mutable.ListBuffer()

    for (x <- (1 to 5).toList) {
      balanceList += AccountBalance("1", x * 145.67, "MyAccount", new DateTime())
    }
    balanceList.toList
  }
}