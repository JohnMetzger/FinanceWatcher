package model.account

import control.AccountBalanceManager
import model.accountbalance.AccountBalance

case class Account(name: String, describtion: String, currentBalance: AccountBalance) {


  val balanceManager = new AccountBalanceManager(this)
  println("Kontoname: " + name + " \nBeschreibung: " + describtion + "\nAktuellerKontostand: " + currentBalance.balance)
}
