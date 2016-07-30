package model.user

import model.account.Account

case class User(name: String, ownedAccounts: List[Account], permittedAccounts: List[Account]) {

}
