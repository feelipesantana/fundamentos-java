

public class BankAccount{

  String number;
  String title;
  double saldo;

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