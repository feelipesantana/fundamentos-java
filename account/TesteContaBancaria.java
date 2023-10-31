
public class TesteContaBancaria {
  
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.setNumber("1234");
    
    account.setTitle("Felipe Santana");

    account.deposit(10);
    account.withdraw(50);

    System.out.println("O saldo é"+ account.getSaldo());
  }
}
