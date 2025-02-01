package final1;

public class FinalFieldmain {

    public static void main(String[] args) {
        // final 필드 -  생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화(필드에 final + 필드 초기화를 하는 경우 static을 붙여서 사용하기!)
        // final 변수를 filed에서 초기화 하는 것은 메모리 낭비임 왜??
        // 어차피 생성된 인스턴스의 변수들이 모두 같은 값을 가지기 때문
        // 따라서 final 변수를 필드에서 초기화 해주는 경우에는 static을 사용해주는 것이 좋음
        // static 영역에만 존재하기 때문에 중복과 메모리 비효율 문제 해결 가능
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
