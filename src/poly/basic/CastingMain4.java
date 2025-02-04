package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        // 다운캐스팅을 자동으로 하지 않는 이유
        // 인스턴스에 존재하지 않는 하위 타입으로 다운캐스팅을 하는 경우 문제가 발생할 수 있어서

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.ChildMethod(); // 문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.ChildMethod(); // 실행 불가

        // 처음에 new Parent()를 통해서 부모 클래스의 인스턴스를 생성
        // 여기에는 자식 클래스의 인스턴스 존재 X
        // 그리고 이 참조값을 다운 캐스팅하면서 Child타입의 변수에 담았다
        // 그럼 호출자의 타입이 Child이기 때문에 child2에서 Child 타입의 속성에 접근할 수 있지만
        // 애초에 생성했던 인스턴스는 Parent 클래스의 인스턴스이기 때문에 Child 타입 존재 X
        // 따라서 접근했지만 Child 타입이 존재하지 않기 때문에 이를 방지하기 위해
        // 자바에서는 사용할 수 없는 타입으로 다운캐스팅 하는 경우 ClassCastException 예외 발생

        // 이와 달리 업캐스팅은 객체 생성시 해당 타입의 상위 부모 타입은 모두 함께 생성되기 때문에
        // 인스턴스가 모두 존재하기 때문에 항상 안전
    }
}
