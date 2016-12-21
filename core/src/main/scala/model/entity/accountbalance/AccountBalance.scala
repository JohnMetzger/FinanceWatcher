package model.entity.accountbalance

import model.entity.Entity
import org.joda.time.DateTime


case class AccountBalance(id: String, balance: Double, accountID: String, date: DateTime) extends Entity
