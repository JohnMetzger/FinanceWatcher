package control

import control.account.AccountControl
import control.transaction.TransactionControl

class MainController {

  val accountControl: AccountControl = new AccountControl()
  val transactionControl: TransactionControl = new TransactionControl()


}
