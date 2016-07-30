package persistence.account

import model.account.Account

class AccountPersistence {

}

object AccountPersistence {

  def get(id: Int): Account = {
    Account(id, "TestAccount" + id, "Just for Test")
  }

  def isValid(id: Int, stemp: Integer): Boolean = {
    //TODO Prüfung schreiben
    true
  }
}
