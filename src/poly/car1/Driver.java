package poly.car1;

public class Driver {
    // 아까와는 달리 역할과 구현을 나누어서 자동차 역할, 즉 인터페이스를 추가
    // 이렇게 하면 드라이버와 각 세부적인 자동차와의 의존이 사라짐
    // 즉, 다형성을 이용해서 자동차 인터페이스 타입에 구현된 차량들을 담아서 사용가능
    // 메서드들의 경우 구현부에서 오버라이딩 하기 때문에 자동차 타입으로 호출하더라도
    // 생성된 객체의 메서드가 실행될 수 있다.
    // 정리하자면 역할과 구현을 나누어 인터페이스를 통해 다형적 참조 + 메서드 오버라이딩을 활용하여
    // 확장에는 열려있고, 변경에는 닫혀있는(Open-Closed Principle) 코드를 만들 수 있다.
    // 쉽게 이야기 해서 기존의 코드 수정 없이 새로운 기능을 추가할 수 있다는 말이다.

    // 인터페이스를 사용해서 확장에 열려있다.
    // 인터페이스를 사용하는 클라이언트 부분의 코드를 수정하지 않아도 된다.
    // 물론 main()과 같이 새로운 차를 생성하고, 필요한 차를 전달해주는 코드 부분은 수정이 발생한다

    // 이 코드는 디자인 패턴 중에서 전략패턴으로 Car 인터페이스가 전략을 정의하는 인터페이스가 되고
    // 각각의 차량이 전략의 구체적인 구현이 된다.
    // 각각의 전략을 클라이언트 코드(Driver)의 변경 없이 손쉽게 교체할 수 있다.
    private Car car;

    public void setCar(Car car){
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
