package control

import java.util.Calendar

import model.account.Account
import model.accountbalance.AccountBalance

import scala.collection.mutable

class AccountBalanceManager(account: Account) {

  println("Welt Hallo")
  val balances = AccountBalanceManager.getSomeAccountBalances()

  for (b <- balances) println(b)
}


object AccountBalanceManager {

  def getSomeAccountBalances(): List[AccountBalance] = {

    println("Hallo Welt")

    val xs = (1 to 5).toList
    val balanceList: mutable.ListBuffer[AccountBalance] = mutable.ListBuffer()

    for (x <- xs) {
      balanceList += AccountBalance(x * 145.67, "MyAccount", Calendar.getInstance())
    }

    balanceList.toList

  }
}
