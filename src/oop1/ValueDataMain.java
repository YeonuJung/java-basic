package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        // 메서드를 클래스에 선언하면 굳이 valueData라는 인스턴스의 참조값을 따로 만든 메서드에 넘겨줄 필요없이
        // 바로 클래스 내부의 멤버변수의 값을 변경할 수 있음

        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }
}

