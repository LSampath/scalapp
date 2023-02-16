package alias

class MotorCycle extends Vehicle {
  override type Engine = PetrolEngine

  override def start(engine: PetrolEngine): Unit = {
    println("starting petrol engine....")
  }
}
