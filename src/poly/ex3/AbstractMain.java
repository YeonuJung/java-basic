package poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {
        // AbstractAnimal animal = new AbstractAnimal() // 추상 클래스 생성 불가
        // 추상적인 개념을 제공하기 때문에 구체적인 인스턴스가 존재하지 않기 때문
        // 상속을 목적으로 사용되고, 부모 클래스 역할을 담당한다
        // 마찬가지로 추상메서드도 오버라이딩을 위해 사용되고
        // 바디가 존재하지 않는다.
        // 정리하자면 추상 클래스는 인스턴스를 생성할 수 없는 클래스로, 상속을 목적으로 사용된다.
        // 추상 메서드는 바디가 없는 메서드로 오버라이딩을 강제하기 위해 사용된다.
        // 이 둘다 클래스나, 메서드와 동일하지만 단지 제약이 추가되었을 뿐이다.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.sound();
        cat.sound();
        cat.move();
        cow.sound();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal){
        animal.sound();
    }

}
