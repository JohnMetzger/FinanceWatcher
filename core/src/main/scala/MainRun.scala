import model.account.Account

object MainRun {

    def main(args: Array[String]): Unit = {

        val accountValueList: Map[String, Any] = Map(("name", "TestAccount"), ("description", "Just for Testing"))

        //val entityPersistence = new EntityPersistence[Account]("account")

        //entityPersistence.add(accountValueList)
        val account = new Account(accountValueList)

    }


}
