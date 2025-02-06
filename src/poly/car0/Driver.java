package poly.car0;

public class Driver {
    // 자동차가 추가될 때 마다 Driver의 코드를 대폭 수정해야 함
    // 왜? 역할과 구현을 구분하지 않았기 때문
    // 지금은 자동차가 늘어나면 멤버변수가 늘고, set함수가 추가되고, drive 내부 로직에 분기문이 추가된다.
    // 즉 드라이버 클래스는 k3와 model클래스에 의존중이다.
    // 의존이란 클래스 의존 관계로, 클래스 상에서 어떤 클래스를 알고 있는가를 의미한다.

    // 참조값은 초기화 안하면 null로 자동 초기화
    private K3Car k3Car;
    private Model3Car model3Car; // 추가

    public void setK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    }

    // 추가
    public void setModel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if(k3Car != null){
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        }else if(model3Car != null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
