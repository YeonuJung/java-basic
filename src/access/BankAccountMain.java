package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        int balance;
        account.deposit(10000);
        balance = account.getBalance();
        System.out.println("잔액: " + balance);
        account.withdraw(10000);
        balance = account.getBalance();
        System.out.println("잔액: " + balance);
    }
}
