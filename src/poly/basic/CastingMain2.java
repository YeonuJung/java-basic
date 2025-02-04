package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다. (컴파일 오류 발생)
        // poly.childMethod();

        // 다운캐스팅(부모 타입 -> 자식 타입)
        // Child child = poly; -> 이렇게 하면 자식 타입에 부모 인스턴스를 담는 것이기 때문에 컴파일 오류 발생
        // 그럼 어떻게 해야 하느냐?
        // 다운캐스팅, 즉 명시적 형변환 해주어야 함
        Child child = (Child) poly;
        child.ChildMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        // 연산자 우선순위를 ()로 변경해준 뒤 다운캐스팅
        ((Child) poly).ChildMethod();
    }
}
