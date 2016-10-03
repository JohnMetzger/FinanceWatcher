package persistence.dbConnection

import com.mongodb.casbah.commons.MongoDBObject
import model.entity.Entity
import persistence.MainPersistence

class EntityPersistence[E <: Entity](collectionName: String) {

  val dbColl = MainPersistence.getDBClient()(collectionName)
  //abstract def get(id: String)

  def add(entityValues: Map[String, Object]): Unit = {

    val builder = MongoDBObject.newBuilder
    for (entityValue <- entityValues) {
      builder += entityValue._1 -> entityValue._2
    }

    val entityObject = builder.result()

    println(entityObject)

    dbColl.insert(entityObject)

    val foundEntityObject = dbColl.findOne(entityObject)

    createEntity(foundEntityObject)

  }

  private def createEntity(dbObject: Option[dbColl.T]): Unit = {
    val opt = dbObject.get.toMap


    //println(implicitly[ClassTag[E]])

    //EntityFactory.createEntity(classOf[E], opt)
  }

  def isValid(id: String, stemp: Integer): Boolean = {
    // TODO Implementierung sobald Network-Rapper existieren
    true
  }


}
