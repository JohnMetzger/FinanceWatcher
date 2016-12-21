package model.entity.user

import model.entity.account.Account

case class User(name: String, ownedAccounts: List[Account], permittedAccounts: List[Account])
