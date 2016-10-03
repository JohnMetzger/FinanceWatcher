package model.entity

abstract class Entity {

  val id: String

  /*def this(attributeMap: Map[String, Any]) {
    this(attributeMap.get("_id"))
    }*/
}

object Entity {

  def getEntityType: String = {
    "entity"
  }


}
