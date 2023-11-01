package vehicle;

public class Car implements Vehicle{
  @Override
  public void speedUp() {
    // TODO Auto-generated method stub
    System.out.println("Acelerando o Carro");
  }

  @Override
  public void brokeUp() {
    // TODO Auto-generated method stub
    System.out.println("Freando o Carro");
  }
}
