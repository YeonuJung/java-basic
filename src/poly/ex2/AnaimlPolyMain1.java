package poly.ex2;

public class AnaimlPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // 다형적 참조로 인해 부모 타입의 변수는 자식 타입의 인스턴스를 담을 수 있음
    // 덕분에 각기 다른 타입들을 위한 메서드를 여러개 만들 필요가 없이 Animal 하나로 모두 받을 수 있음
    // 하지만 여기서 끝나면 여전히 메서드 호출은 Animal의 메서드가 호출되기 때문에 문제 발생
    // 메서드 오버라이딩의 우선 순위로 인해 자식 메서드가 적용되는 점을 이용
    // 이렇게 하면 다형적 참조를 통해 부모 타입으로 자식 인스턴스 모두에 접근할 수 있고
    // 메서드 오버라이딩을 이용해서 부모의 메서드를 호출하더라도 자식의 메서드를 호출할 수 있게된다
    // 정리하자면 부모의 역할은 하나의 타입으로 자식 타입 모두를 참조 가능하도록 하고
    // 오버라이딩을 통해 자식 타입의 메서드를 사용 가능하도록 하기 위함

    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
