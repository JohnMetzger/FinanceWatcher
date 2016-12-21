package model.entity

import play.api.libs.json.{JsPath, Reads}
import play.api.libs.functional.syntax._

trait Entity {

  val id: String

  /*def this(attributeMap: Map[String, Any]) {
    this(attributeMap.get("_id"))
    }*/
}



