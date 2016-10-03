package model.account

import manager.accountbalance.AccountBalanceManager
import model.entity.Entity

case class Account(id: String, name: String, description: String) extends Entity {

  val balanceManager = new AccountBalanceManager(this)
  println("ID: " + id + "\nKontoname: " + name + " \nBeschreibung: " + description + "\nAktuellerKontostand: " + balanceManager.currentBalance)

  def this(attributeMap: Map[String, Any]) {

    this(attributeMap.get("_id").toString,
      attributeMap.get("name").toString,
      attributeMap.get("description").toString)
  }

}


object AccountType {

  def getEntityType: String = {
    "account"
  }
}