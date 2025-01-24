package ref;

public class VarChange1 {
    public static void main(String[] args) {
        // 자바에서 변수를 대입할 경우 변수에 있는 값을 복사해서 대입한다!
        // 즉 a에 10을 대입하고 b에 a를 대입하면 b에는 a에 담긴 10이 대입되는 것이다.
        // 따라서 a를 변경하더라도 변수 a의 값만 변경되는 것이지 b에 대입한 10은 변하지 않는다.
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
