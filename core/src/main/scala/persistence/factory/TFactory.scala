package persistence.factory

import model.entity.Entity

trait TFactory {

  def create(attributeMap: Map[String, Object]): Entity
}
