package model.manager

class MainManager {

  /**
    * List should maybe changed to Map
    * must be generic
    */
  /*var accountsManager:mutable.ListBuffer[(AccountManager, Calendar)] = mutable.ListBuffer()
  var transactionsManager = mutable.ListBuffer()

  var accounts:mutable.Map = mutable.Map


  def addAccountManager(accountManager: AccountManager): Unit = {
    accountsManager += new Tuple2(accountManager, Calendar.getInstance())
  }

  def getAccountManager(index: Int): AccountManager = {

    if (index <= accountsManager.length) {
      accountsManager(index) = new Tuple2(accountsManager(index)._1, Calendar.getInstance())
      accountsManager(index)._1
    } else {
      // Aufruf als über Datenbank
      var newAccountManager = new AccountManager()
      accountsManager += new Tuple2(newAccountManager, Calendar.getInstance())
      newAccountManager
    }
  }*/

}
