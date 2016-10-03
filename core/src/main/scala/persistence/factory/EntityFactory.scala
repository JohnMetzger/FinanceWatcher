package persistence.factory

import model.entity.Entity

object EntityFactory {

  val specificFactory: Map[_ <: Entity, TFactory] = Map()

  //println(AccountType.getEntityType())

  //specificFactory + (Account.getEntityType() -> AccountFactory)
  //specificFactory + (Transaction.getEntityType() -> TransactionFactory)


  def createEntity(entityType: String, attributeMap: Map[String, Object]) = {
    //specificFactory.get(entityType).create(attributeMap)
    //AccountFactory.create(attributeMap)

    None
  }


}
