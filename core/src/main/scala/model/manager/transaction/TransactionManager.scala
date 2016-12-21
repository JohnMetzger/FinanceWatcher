package model.manager.transaction

import java.util.Calendar

import model.entity.account.Account

class TransactionManager(account: Account) {
  // maybe a List of accounts

  //var transactionCollection: TransactionCollection = new TransactionCollection()

  def addTransaction(amount: Double,
                     benefitedAccount: Account,
                     debitedAccount: Account,
                     affectDate: Calendar,
                     creationDate: Calendar): Unit = {

  }
  //var transactionCollection:
}
