package manager.account

import model.account.Account
import persistence.dbConnection.account.AccountPersistence

import scala.collection.mutable

class AccountMasterManager {

  var accounts: mutable.Map[String, AccountEntity] = new mutable.HashMap[String, AccountEntity]

  def get(accountID: String): Account = {
    if (accounts contains accountID) {
      val accEntity: AccountEntity = accounts(accountID)

      if (!AccountPersistence.isValid(accEntity.account.id, accEntity.stamp)) {
        updateAccount(accountID)
      } else {
        accEntity.account
      }
    } else {
      updateAccount(accountID)
    }
  }

  private def updateAccount(accountID: String): Account = {
    val account = AccountPersistence.get(accountID)
    this.addAccount(account)
    account
  }

  private def addAccount(account: Account): Unit = {
    accounts += (account.id -> AccountEntity(account, 0))
  }

  def addNewAccount(name: String, description: String): Unit = {
    AccountPersistence.addNewAccount(name, description)

    //this.addAccount(account)
  }
}

case class AccountEntity(account: Account, stamp: Integer)