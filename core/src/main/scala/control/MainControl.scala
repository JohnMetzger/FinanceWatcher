package control

import manager.account.AccountMasterManager
import manager.transaction.TransactionMasterManager

object MainControl {

  //val accountManager: AccountManager = new AccountManager()
  //val transactionManager: TransactionManager = new TransactionManager()

  //val mainManager: MainManager = new MainManager()

  val accountManager: AccountMasterManager = new AccountMasterManager()
  val transactionManager: TransactionMasterManager = new TransactionMasterManager()
}
