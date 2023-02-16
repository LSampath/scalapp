package alias

trait Vehicle {
  type Engine

  def start(engine: Engine)
}
