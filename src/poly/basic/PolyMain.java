package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 다형적 참조란 다양한 형태를 참조할 수 있다는 말
        // 부모 타입은 자신은 물론이고 모든 자식 타입을 참조할 수 있다

        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        // 상속 받았기 때문에 자식 인스턴스에 부모 인스턴스도 함께 생성
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.ChildMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); // 이건 참조 불가 왜냐? 변수의 타입을 Parent 타입으로 하여 호출을 했기 때문에
        // 인스턴스의 Parent 타입부터 시작해서 필요한 기능을 찾고 없으면 상속관계에 따라 상위로 올라간다.
        // 상속 관계는 상위로는 올라갈 수 있지만 아래로는 내려갈 수 없기 때문에 자식 타입에 있는 메서드 참조 불가
        // 이 경우 인스턴스의 자식 타입에 있는 메서드를 호출하고 싶다면 *캐스팅*이 필요

        // Child child1 = new Parent(); // 자식 변수는 부모 인스턴스 참조 불가
        // 자바에서 부모 변수는 자식 인스턴스를 참조할 수 있다.
        // 부모는 자식을 담을 수 있다고 쉽게 생각하기
    }
}
