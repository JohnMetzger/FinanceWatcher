package control.transaction

import java.util.Calendar

import model.entity.account.Account

class TransactionControl {

  def makeTransaction(): Unit = {

  }

}

object TransactionControl {


  def doTransaction(amount: Double,
                    benefitedAccount: Account,
                    debitedAccount: Account,
                    affectDate: Calendar): Unit = {

    //transactionManager.addTransaction(amount, benefitedAccount, debitedAccount, affectDate, Calendar.getInstance())

    //benefitedAccount.balanceManager

    /**
      * Create and Add Transaction to TransactionCollection and DB
      * Add AccountBalances to both Accounts and update their current Balance
      */

  }
}
