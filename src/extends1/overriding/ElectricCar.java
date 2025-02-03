package extends1.overriding;

public class ElectricCar extends Car {
    // 부모의 기능을 자식이 재정의 하는 것을 오버라이딩이라고 한다
    // override = 덮어쓰기
    // @이 붙은 부분을 애노테이션이라 하는데, 쉽게 말해 !!프로그램이 읽을 수 있는 특별한 주석!!을 말한다.
    // 필수는 아니지만 애노테이션을 쓰면 컴파일 오류를 통해 예상치 못한 오류를 방지할 수 있다
    @Override
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");

    }

    public void charge(){
        System.out.println("충전합니다.");
    }
}
