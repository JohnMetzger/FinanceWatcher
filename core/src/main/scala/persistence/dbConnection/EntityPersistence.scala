package persistence.dbConnection

import com.mongodb.{BasicDBObject, DBObject}
import com.mongodb.casbah.commons.MongoDBObject
import main.scala.persistence.parser.DocumentParser
import model.entity.Entity
import org.bson.Document
import org.bson.types.ObjectId
import persistence.MainPersistence
import play.api.libs.json.Json
import play.api.libs.json._


class EntityPersistence[E <: Entity](collectionName: String)
                                    (implicit manifest: Manifest[E]){

  val dbColl = MainPersistence.getDBClient()(collectionName)

  def add(entityValues: Map[String, Any]): Unit = {

    val builder = MongoDBObject.newBuilder
    for (entityValue <- entityValues) {
      builder += entityValue._1 -> entityValue._2
    }

    val entityObject = builder.result()
    dbColl.insert(entityObject)
    val foundEntityObject = dbColl.findOne(entityObject)
    println("add get class: " + foundEntityObject)
    //createEntity(foundEntityObject)
  }

  def get(id: String): E = {
    val dbObject = dbColl.findOneByID(new ObjectId(id)).get
    createEntity(dbObject, id = id)
  }

  private def setupId(dbObject: DBObject, id: String) : JsValue = {
    val jsonObject = Json.parse(dbObject.toString)
    val id = (jsonObject \ "_id" \ "$oid").get.toString().replace("\"", "")
    jsonObject.as[JsObject] - "_id" ++ JsObject(Seq(("id", JsString(id))))
  }

  private def createEntity(dbObject: DBObject, id: String): E = {
    DocumentParser.read[E](setupId(dbObject, id))
  }

  def isValid(id: String, stemp: Integer): Boolean = {
    // TODO Implementierung sobald Network-Rapper existieren
    true
  }


}
