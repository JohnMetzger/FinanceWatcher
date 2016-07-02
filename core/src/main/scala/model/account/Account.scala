package model.account

import manager.accountbalance.AccountBalanceManager

case class Account(name: String, describtion: String) {


  val balanceManager = new AccountBalanceManager(this)
  //println("Kontoname: " + name + " \nBeschreibung: " + describtion + "\nAktuellerKontostand: " + balanceManager.currentBalance)
}
