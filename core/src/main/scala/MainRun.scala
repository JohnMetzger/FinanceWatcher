package main.scala

import java.util.Calendar

import control.AccountBalanceManager
import model.account.Account
import model.accountbalance.AccountBalance

object MainRun {

    def main(args: Array[String]): Unit = {
        val accbal1 = AccountBalance(500, "MyAccount", Calendar.getInstance())
        val accbal2 = AccountBalance(1000, "NyOtherAccount", Calendar.getInstance())

        val acc1 = Account("MyAccount", "Just for testing", accbal1)
        val acc2 = Account("NyOtherAccount", "Just for testing", accbal2)

        println("----------------------------------------------------------------------------")
        val accbalman: AccountBalanceManager = new AccountBalanceManager(acc1)

    }


}
