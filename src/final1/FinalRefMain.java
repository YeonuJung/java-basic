package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data(); 앞서 data에는 참조값이 담겨있는데 final로 선언했기에 변경 불가

        // 참조값은 변경 불가하지만 참조 대상의 값은 변경 가능
        // 참조값이라는건 해당 인스턴스의 위치를 가리킬 뿐, 인스턴스 내부의 값과는 무관함
        data.value = 10;
        System.out.println("참조 대상의 값 : " + data.value);
        data.value = 20;
        System.out.println("참조 대상의 값 : " + data.value);

    }
}
