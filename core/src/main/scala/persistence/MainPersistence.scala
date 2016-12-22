package persistence

import com.mongodb.casbah.MongoClient
import model.entity.account.Account
import model.entity.accountbalance.AccountBalance
import model.entity.transaction.Transaction
import persistence.dbConnection.EntityPersistence

object MainPersistence {

  private val dbClient = MongoClient("localhost", 27017)

  def getDBClient() = {
    dbClient("financeWatcher")
  }

  val accountPersistence = new EntityPersistence[Account]("account")
  val transactionPersistence = new EntityPersistence[Transaction]("transaction")
  val accountBalancePersistence = new EntityPersistence[AccountBalance]("accountBalancePersistence")

}
