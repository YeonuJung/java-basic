package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        // 상속받은 클래스, 즉 자식 클래스는 생성자에서 반드시 부모 생성자를 호출해야 함
        // 단, 기본 생성자의 경우 생략 가능(부모 클래스의 생성자가 기본 생성자인 경우 생략 가능)
        ClassA classA = new ClassA();
        System.out.println();
        ClassB classB = new ClassB(1);
        System.out.println();
        ClassC classC = new ClassC();
    }
}
