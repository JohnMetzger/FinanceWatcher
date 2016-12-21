import java.util.Calendar

import model.entity.account.Account
import model.entity.Entity
import model.manager.accountbalance.AccountBalanceManager
import org.joda.time.DateTime
import persistence.dbConnection.EntityPersistence
import play.api.libs.json
import play.api.libs.functional.syntax._
import play.api.libs.json._
import play.api.libs.json.{JsPath, JsValue, Json, Reads}

object MainRun {
  def main(args: Array[String]): Unit = {

    //val accountValueList: Map[String, Any] = Map(("name", "TestAccount"), ("description", "Just for Testing"))


    //val entityPersistence = new EntityPersistence[Account]("account")

    val testJson : JsValue = Json.parse(
      """
        |{"id": "12345",
        |"name": "TestAccount",
        |"description": "Just for Testing"}
      """.stripMargin)

    //val acc = entityPersistence.get("580394cfe49bad063066fcff")
    //println("acc: " + acc)

    val account: Account = Account("1234", "Volksbank", "None")

    val accManager: AccountBalanceManager = account.balanceManager

    val currBala = accManager.currentBalance

    println("Aktueller Kontostand: " + currBala.balance)

    /*
    val date = new DateTime(2015, 2, 20, 12, 24, 2, 5)
    val year2000 = new DateTime().withYear(2000)
    val month12 = new DateTime().withMonthOfYear(12)

    println(date)
    println(year2000)
    println(month12)
    */
  }
}
