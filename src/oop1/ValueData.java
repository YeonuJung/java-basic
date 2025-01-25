package oop1;

public class ValueData {
    int value;

    // 클래스에는 멤버변수 뿐만 아니라 기능을 가지는 메서드를 선언할 수 있다.
    // 이때 static이 왜 없냐?
    // 원래 메서드는 객체를 생성해야만 쓸 수 있는데 static 키워드는 객체 생성없이 쓸 수 있게 해주는 도구
    // 여기서는 어차피 객체를 처음에 생성하기 때문에 굳이 static 붙일 필요X
    void add(){
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
