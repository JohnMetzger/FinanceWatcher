package persistence.dbConnection.account

import com.mongodb.casbah.commons.MongoDBObject
import model.entity.account.Account
import org.bson.types.ObjectId
import persistence.MainPersistence

object AccountPersistence {

  val dbColl = MainPersistence.getDBClient()("account")

  def get(id: String): Account = {

    val accountObject = dbColl.findOneByID(new ObjectId(id))
    createAccount(accountObject)
  }

  def isValid(id: String, stemp: Int): Boolean = {
    //TODO Prüfung schreiben
    true
  }

  def addNewAccount(name: String, description: String) = {

    val accountObject = MongoDBObject("name" -> name, "description" -> description)

    val foundAccountObject = dbColl.findOne(accountObject)

    if (foundAccountObject.isDefined) {
      createAccount(foundAccountObject)
    } else {
      None
    }
  }

  private def createAccount(dbObject: Option[dbColl.T]): Account = {

    val opt = dbObject.get.toMap

    Account(opt.get("_id").toString, opt.get("name").toString, opt.get("description").toString)
  }
}
