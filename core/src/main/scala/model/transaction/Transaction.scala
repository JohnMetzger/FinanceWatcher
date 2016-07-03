package model.transaction

import java.util.Calendar

import model.account.Account

case class Transaction(amount: Double, benefitedAccount: Account, debitedAccount: Account, affectDate: Calendar, creationDate: Calendar) {

}
