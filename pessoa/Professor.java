package pessoa;

public class Professor {
  private double salary;

  public void setSalary(double salary){
    this.salary = salary;
  }
  public double getSalario(){
     return this.salary;
  }

  public String imprimirTipo(){
    return "Você é professor";
  }

  
}
