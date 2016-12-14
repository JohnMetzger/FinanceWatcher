package main.scala.persistence.parser

//import akka.serialization.Serialization
import org.bson.Document
import org.json4s.FieldSerializer._
import play.api.libs.json.{JsObject, JsValue}
import org.json4s._
import org.json4s.jackson.Serialization

object DocumentParser {

  val id_serializer = FieldSerializer[Object](renameTo("id", "_id"), renameFrom("_id", "id"))

  val baseFormats = Serialization.formats(NoTypeHints) + id_serializer
  val formats = baseFormats

  def read[T](document: JsValue)(implicit manifest: Manifest[T]): T = {
    Serialization.read[T](document.toString())(formats, manifest)
  }

}
