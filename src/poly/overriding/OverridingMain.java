package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();
        System.out.println();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 X
        poly.method(); // 메서드는 오버라이딩 O

        // 어째서? 분명 호출자의 타입이 Parent인데, 그럼 Child 인스턴스에서 Parent 타입(클래스)에서 먼저 찾는거 아닌가?
        // 맞다. 하지만 하위 타입에 오버라이딩 된 메서드가 있는 경우 오버라이딩 된 메서드는 항상 우선권을 가진다
        // 오버라이딩 된 메서드는 항상 우선권을 가진다!! 이 부분이 중요
        // 만약 더 하위 클래스에서 메서드를 오버라이딩 하면 그 하위 클래스의 메서드가 호출된다

        // 다시 정리하자면 다형적 참조란 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능이다.
        // 하지만 변수 타입이 부모 타입이라서 자식 인스턴스에 있는 자식 타입에 접근할 수 없기 때문에
        // 다운캐스팅이라는 것을 활용해서 자식 인스턴스의 자식 타입에 있는 기능에 접근할 수 있다.
        // 물론 인스턴스에 없는 타입으로 다운 캐스팅 하는 경우 런타임 오류 발생
        // 메서드 오버라이딩의 경우 오버라이딩 된 메서드가 항상 우선권을 가진다
        // 따라서 다형적 참조를 하는 상황에서 부모 타입의 변수가 메서드에 접근하면
        // 호출자의 타입에 따라서 자식 인스턴스의 부모 타입에서 메서드를 찾지만
        // 하위 타입에서 메서드를 오버라이드 하고 있기 때문에 하위 타입의 오버라이딩 하는 메서드가 호출된다.
        // 즉, 하위 타입에서 오버라이딩 하는 메서드가 있는 경우 해당 메서드가 호출된다.
    }
}
