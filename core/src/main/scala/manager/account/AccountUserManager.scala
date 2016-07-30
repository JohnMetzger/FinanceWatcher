package manager.account

import model.account.Account

import scala.collection.mutable

class AccountUserManager() {

  var accounts: List[Account] = AccountUserManager.getTestAccounts

  println(accounts)

  def createAccount(name: String, describtion: String): Unit = {
    val account = Account(1, name, describtion)
    accounts = account :: accounts
  }
}

object AccountUserManager {

  def getTestAccounts: List[Account] = {
    //for use without database

    val accountList: mutable.ListBuffer[Account] = mutable.ListBuffer()

    for (x <- (1 to 5).toList) {
      accountList += Account(x, "Account%d".format(x), "Simple Account")
    }

    accountList.toList

  }
}
