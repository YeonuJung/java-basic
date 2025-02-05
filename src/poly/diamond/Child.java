package poly.diamond;

public class Child implements InterfaceA, InterfaceB{
    // 인터페이스는 이렇게 다중 구현이 가능하다
    // 추상 메서드로만 이루어지기 때문에 구현하는 곳에서 오버라이딩한 게 적용되기 때문
    // 뿐만 아니라 겹치는 메서드여도 어차피 오버라이딩된 메서드 하나만 적용되기 때문
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
