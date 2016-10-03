package persistence

import com.mongodb.casbah.MongoClient
import model.account.Account
import model.transaction.Transaction
import persistence.dbConnection.EntityPersistence

class MainPersistence {

}

object MainPersistence {

  private val dbClient = MongoClient("localhost", 27017)

  def getDBClient() = {
    dbClient("financeWatcher")
  }

  val accountPersistence = new EntityPersistence[Account]("account")
  val transactionPersistence = new EntityPersistence[Transaction]("transaction")

}
