package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; // 컴파일 오류

        // final 지역 변수2
        final int data2 = 10;
        // data2 = 20; // 컴파일 오류

        // final로 설정된 매개변수의 경우는 이후에 메서드 내부에서 매개변수 변경 불가능
        method(10);


    }
    static void method(final int parameter){
        // parameter = 20; 메서드 호출시 매개변수 값을 변경할 수 없음
    }
}
