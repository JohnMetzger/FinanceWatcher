package model.accountbalance

import java.util.Calendar

case class AccountBalance(id: Int, balance: Double, accountName: String, date: Calendar) {

  val day = date.get(Calendar.DAY_OF_MONTH)
  val month = date.get(Calendar.MONTH) + 1
  val year = date.get(Calendar.YEAR)
  //println("Date of AccountBalance: " + day + "." + month + "." + year)
}
