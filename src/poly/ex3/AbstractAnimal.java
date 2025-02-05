package poly.ex3;

public abstract class AbstractAnimal {

    // 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 함
    // 추상 메서드는 메서드 바디가 없음
    // 추상 메서드는 반드시 자식 클래스에서 오버라이딩 해야 함
    // 만약 자식 클래스에서 오버라이딩 하지 않으려면 자식 클래스도 추상 클래스로 선언해야 함
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
