package vehicle;

public class FirstVehicle {
  
  public static void main(String[] args) {
    Vehicle myCar = new Car();
    Vehicle myAriPlane = new AirPlane();

    myCar.brokeUp();
    myAriPlane.speedUp();
  }
}
