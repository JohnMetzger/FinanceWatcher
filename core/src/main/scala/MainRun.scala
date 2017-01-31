import model.entity.account.Account
import model.entity.Entity
import model.entity.accountbalance.AccountBalance
import model.manager.accountbalance.AccountBalanceManager
import org.bson.types.ObjectId
import org.joda.time.DateTime
import persistence.dbConnection.EntityPersistence
import play.api.libs.json
import play.api.libs.functional.syntax._
import play.api.libs.json._
import play.api.libs.json.{JsPath, JsValue, Json, Reads}
//import org.json4s._
import play.api.libs.json.Json


object MainRun {
  def main(args: Array[String]): Unit = {

    val date = DateTime.now()
    println(date)

    val accbalance = AccountBalance("123", 1.2, "123", DateTime.now())
    println(accbalance)

    Json.parse(accbalance)

  }
}
