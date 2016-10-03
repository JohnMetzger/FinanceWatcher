package persistence.factory.transaction

import model.account.Account
import model.entity.Entity
import persistence.factory.TFactory

object TransactionFactory extends TFactory {

  override def create(attributeMap: Map[String, Object]): Entity = {
    /*Transaction(attributeMap.get("_id").toString,
      attributeMap.get("amount"),
      attributeMap.get("benefitedAccount").toString,
      attributeMap.get("debitedAccount").toString,
      attributeMap.get("affectDate").toString,
      attributeMap.get("creationDate").toString)
  }*/
    Account(attributeMap.get("_id").toString,
      attributeMap.get("name").toString,
      attributeMap.get("description").toString)
  }
}
