package poly.ex5;

public class Dog implements InterfaceAnimal{
    @Override
    public void move() {
        System.out.println("강아지가 이동합니다.");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
