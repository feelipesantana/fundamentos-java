
public class TesteContaBancaria {
  
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.number = "1234";
    account.title = "Felipe Santana";
    account.saldo = 500;

    account.deposit(10);
    account.withdraw(120);
  }
}
