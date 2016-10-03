package persistence.factory.account

import model.account.Account
import model.entity.Entity
import persistence.factory.TFactory

object AccountFactory extends TFactory {

  override def create(attributeMap: Map[String, Object]): Entity = {
    Account(attributeMap.get("_id").toString,
      attributeMap.get("name").toString,
      attributeMap.get("description").toString)
  }

}
