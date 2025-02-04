package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다. (컴파일 오류 발생)
        // poly.childMethod();

        // 다운캐스팅(부모 타입 -> 자식 타입)
        // Child child = poly; -> 이렇게 하면 자식 타입에 부모 인스턴스를 담는 것이기 때문에 컴파일 오류 발생
        // 그럼 어떻게 해야 하느냐?
        // 다운캐스팅, 즉 명시적 형변환을 해주어야 함
        Child child = (Child) poly;
        child.ChildMethod();

        // 항상 명심해야 하는 것은 자바에서 변수의 대입은 그 값을 복사해서 대입한다는 점
        // 즉, 캐스팅을 하더라도 기존 poly의 타입이 Child로 변하는 건 아니다
        // 우선 변수의 타입이 Child이니 이를 맞춰주기 위해서 poly의 타입을 Child로 명시적 형변환을 하고
        // 그 다음 poly에 있는 참조값을 복사해서 이를 child 변수에 넣는 것
    }
}
