package persistence

import com.mongodb.casbah.MongoClient

class MainPersistence {

}

object MainPersistence {

  private val dbClient = MongoClient("localhost", 27017)

  def getDBClient() = {
    dbClient("financeWatcher")
  }


}
