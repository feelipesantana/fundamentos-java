package vehicle;

public class AirPlane implements Vehicle {
  @Override
  public void brokeUp() {
    System.out.println("Freando o avião");
  }

  @Override
  public void speedUp() {
    System.out.println("Acelerando o avião");
    
  }
}
