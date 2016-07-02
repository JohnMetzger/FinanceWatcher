package manager.account

import model.account.Account

import scala.collection.mutable

class AccountManager() {

  var accounts: List[Account] = AccountManager.getTestAccounts

  println(accounts)

  def createAccount(name: String, describtion: String): Unit = {
    val account = Account(name, describtion)
    accounts = account :: accounts
  }
}

object AccountManager {

  def getTestAccounts: List[Account] = {
    //for use without database

    val accountList: mutable.ListBuffer[Account] = mutable.ListBuffer()

    for (x <- (1 to 5).toList) {
      accountList += Account("Account%d".format(x), "Simple Account")
    }

    accountList.toList

  }
}
