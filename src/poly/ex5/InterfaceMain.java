package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        // 인터페이스도 마찬가지로 생성 불가(추상 클래스와 동일)
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        // 내부 메서드가 모두 추상 메서드이기 때문에 순수 추상 클래스와 비슷
        // 하지만 순수 추상 클래스는 임의로 메서드를 선언할 수 있지만
        // 인터페이스는 추상 메서드로만 구성되도록 강제하기 때문에 좀 더 제약이 있다
        // 인터페이스는 부모를 여러명 두는 다중 구현이 가능하다
        // 왜냐하면 클래스와는 달리 인터페이스는 모두 추상 메서드로 구성되어 있기 때문에
        // 어차피 자식 클래스에서 오버라이딩된 메서드가 적용된다
        // 자바에서는 순수 추상 클래스라는 말이 없고 그냥 인터페이스 사용하면 된다
        // 정리하자면 모든 메서드가 추상 메서드인 경우 인터페이스를 사용하면 된다.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
