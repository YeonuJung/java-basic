package poly.ex.pay0;

// 변하지 않는 부분(클라이언트 코드)
public class PayService {

    public void processPay(String option, int amount){
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        // 처음에는 메서드로 분리했으나 PayService에 있는 코드는 변하면 안되기 때문에
        // 따로 PayStore 클래스를 만들어서 결제관련 함수, 예를 들어 findPay함수를 분리
        // PayStore 클래스에는 변하는 부분들이 담김
        // 이렇게 하면 이제 앞으로 새로운 결제수단이 추가되더라도 PayService의 코드는 변하지 않음
        // 그리고 특정 결제수단에 의존을 없애기 위해 다형성을 이용해서 Pay 인터페이스 생성 및 활용

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if(result){
            System.out.println("결제가 성공했습니다.");
        }else{
            System.out.println("결제가 실패했습니다.");
        }
    }
}
