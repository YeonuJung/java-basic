package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        // static 메서드도 마찬가지로 객체 생성없이 바로 접근할 수 있음
        // 메서드가 멤버변수를 사용하지 않는 경우 굳이 인스턴스를 생성할 필요없기에
        // 이럴 때는 static으로 메서드를 만들어서 사용
        // static 메서드는 인스턴스 변수나 인스턴스 메서드를 사용할 수 X
        String deco = DecoUtil2.deco(s);
        System.out.println("deco = " + deco);
    }
}
