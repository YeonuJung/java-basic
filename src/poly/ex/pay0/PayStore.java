package poly.ex.pay0;

public abstract class PayStore {

    // 결제 수단 추가시 변하는 부분
    // 추상 클래스로 만들어서 인스턴스 생성 못하도록(메서드만 사용하고 실체가 없기 때문에)

    // 인스턴스 생성없이 사용할 수 있도록 static으로 선언
    public static Pay findPay(String option){
        if(option.equals("kakao")){
            return new KakaoPay();
        }else if(option.equals("naver")){
            return new NaverPay();
        }else{
            // null Object 패턴 사용
            // 기존에 null을 반환하던 부분을 따로 클래스로 만들어줌
            // 이렇게 하면 nullPointerException을 해결할 수 있다
            // 왜냐하면 다형성을 이용해서 여러 객체를 참조하기 때문에
            // null인 케이스의 경우 따로 추가적인 예외처리를 해주어야 함
            // null object 패턴을 사용하면 null 체크 부분을 없앨 수 있음
            return new DefaultPay();
        }
    }

}
