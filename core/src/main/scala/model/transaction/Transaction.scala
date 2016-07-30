package model.transaction

import java.util.Calendar

case class Transaction(id: Int, amount: Double, benefitedAccount: String, debitedAccount: String, affectDate: Calendar, creationDate: Calendar) {

}
