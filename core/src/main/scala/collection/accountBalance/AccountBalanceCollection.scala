package collection.accountBalance

import java.util.Calendar

import model.account.Account
import model.accountbalance.AccountBalance

import scala.collection.mutable

class AccountBalanceCollection(account: Account) {
  println("Welt Hallo")
  val balances = AccountBalanceBalance.getSomeAccountBalances()

  for (b <- balances) println(b)
}

object AccountBalanceCollection {

  def getSomeAccountBalances(account: Account): List[AccountBalance] = {
    /**
      * Dient der Daten-Generierung ohne Datenbank
      */
    println(s"Load data to %s - Account".format(account.name))

    val xs = (1 to 5).toList
    val balanceList: mutable.ListBuffer[AccountBalance] = mutable.ListBuffer()

    for (x <- xs) {
      balanceList += AccountBalance(x * 145.67, "MyAccount", Calendar.getInstance())
    }

    balanceList.toList

  }
}