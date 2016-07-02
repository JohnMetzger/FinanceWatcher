package model.account

import control.AccountBalanceManager

case class Account(name: String, describtion: String) {


  val balanceManager = new AccountBalanceManager(this)
  println("Kontoname: " + name + " \nBeschreibung: " + describtion + "\nAktuellerKontostand: " + balanceManager.currentBalance)
}
