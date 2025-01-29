package access;

public class BankAccount {
    // 외부에서 접근 불가
    // 멤버변수는 되도록 메서드를 통해서만 접근가능하도록 캡슐화 하는 것이 원칙(private 사용)
    // 기능도 필요한 기능만 노출하고 나머지는 캡슐화 하는 것이 원칙
    // 내부에서만 사용하는 기능은 private 사용

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드
    public void withdraw(int amount){
        if(isAmountValid(amount) && (balance >= amount)){
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드
    public int getBalance(){
        return balance;
    }

    // 내부에서만 사용하는 메서드이기 때문에 private으로 캡슐화
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return (amount > 0);
    }
}
