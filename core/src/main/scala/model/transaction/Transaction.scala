package model.transaction

import java.util.Calendar

import model.entity.Entity

case class Transaction(id: String,
                       amount: Double,
                       benefitedAccount: String,
                       debitedAccount: String,
                       affectDate: Calendar,
                       creationDate: Calendar) extends Entity {

  println("ID: " + id + "\nBetrag: " + amount + " \nBeguenstigtesKonto: " + benefitedAccount + "\nBetroffenesKonto: " + debitedAccount + "\nGueltigesDatum: " + affectDate + "\nErzeugungsDatum: " + creationDate)

}

object Transaction {
  def getEntityType: String = {
    "transaction"
  }
}