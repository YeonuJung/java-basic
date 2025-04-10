package poly.ex2;

public class AnaimlPolyMain3 {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new Duck()};

        // 변하지 않는 부분
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
