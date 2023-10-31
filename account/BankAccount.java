

public class BankAccount{

  private String number;
  private String title;
  private double saldo;

  public BankAccount(){
    this.saldo = 100;
  }

  public void setNumber(String value){
    this.number = value; 
  }
  public void setTitle(String value){
    this.title = value;
  }
  // public void setSaldo(double value){
  //   this.saldo = value;
  // }
  
  public String getTitle(){
    return this.title;  
  }
  public double getSaldo(){
    return this.saldo;  
  }

  void deposit(double value){
    if(value > 0){
      saldo = saldo +value;
      System.out.println("Deposito de R$"+ value + "Saldo atual:"+saldo);
    
    }else{
      System.out.println("O Valor de Deposito invalid");

    }

  }

  void withdraw(double value){
    if(value > 0 && value <= saldo){
      saldo = saldo - value;
      System.out.println("Saque de R$"+ value + "Saldo atual:"+saldo);

    }
  }

}