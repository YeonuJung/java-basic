package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        // 모든 메서드가 추상 메서드인 클래스를 순수 추상 클래스라고 한다
        // 순수 추상 클래스는 실행 로직이 전혀 없다
        // 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공
        // 자바에서는 순수 추상 클래스와 거의 유사하고 더 편리한 기능을 제공하는 인터페이스를 제공
        // 자바에서는 순수 추상 클래스를 사용하지 않고 이 경우 인터페이스를 사용한다
        // 인터페이스는 상속받는다고 이야기 하지 않고 구현한다고 이야기 함
        // 인터페이스는 추상메서드와 상수만을 정의할 수 있다
        // public abstract 키워드 생략 가능
        // public static final 키워드 생략 가능

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        moveAnimal(dog);
        soundAnimal(cat);
        moveAnimal(cat);
        soundAnimal(cow);
        moveAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 움직임 테스트 시작");
        animal.move();
        System.out.println("동물 움직임 테스트 종료");
    }
}
