package model.entity.account

import model.manager.accountbalance.AccountBalanceManager

case class Account(id: String, name: String, description: String) extends TAccount {

  val balanceManager = new AccountBalanceManager(this)

  println("-- Account: --")
  println("ID: " + id.toString + "\nKontoname: " + name + " \nBeschreibung: " + description + "\nAktuellerKontostand: " + balanceManager.currentBalance)
  println("ID-Type: " + id.getClass)
  println("-- -- -- -- --")


}
