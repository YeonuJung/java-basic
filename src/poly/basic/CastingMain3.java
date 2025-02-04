package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
      // 업캐스팅 vs 다운캐스팅
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅은 생략 가능, 생략 권장
        Parent parent2 = child; // 업캐스팅 생략, 위 코드와 동일
        // 그래서 부모가 자식을 담을 수 있다고 말하는 것, 업캐스팅이 생략되어 있기 때문에
        // 업캐스팅은 왜 생략가능한가? 업캐스팅 자체로는 문제가 발생하지 않기 때문
        // 하지만 다운캐스팅은 심각한 런타임 오류가 발생 가능하기에
        parent1.parentMethod();
        parent2.parentMethod();
    }
}
