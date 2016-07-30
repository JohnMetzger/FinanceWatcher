import manager.account.AccountMasterManager

object MainRun {

    def main(args: Array[String]): Unit = {
      /*val accbal1 = AccountBalance(500, "MyAccount", Calendar.getInstance())
      val accbal2 = AccountBalance(1000, "NyOtherAccount", Calendar.getInstance())

      val acc1 = Account("MyAccount", "Just for testing")
      val acc2 = Account("NyOtherAccount", "Just for testing")

      println("----------------------------------------------------------------------------")
      val accbalman: AccountBalanceManager = new AccountBalanceManager(acc1)
      */


        //val accountManager: AccountManager = new AccountManager()

        //accountManager.createAccount("Newaccount", "Just a Test")

        //println(accountManager.accounts)


        //println(MainControl.mainManager.testString)

        //MainControl.mainManager.changeTestString()

        //println(MainControl.mainManager.testString)

        val accountManager = new AccountMasterManager()

        val account1 = accountManager.get(1)
        val account2 = accountManager.get(2)
        val account3 = accountManager.get(1)

        println(account1)
        println(account2)
        println(account3)

    }


}
