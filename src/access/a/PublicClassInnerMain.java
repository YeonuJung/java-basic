package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {

        // 같은 패키지이기 때문에 public 뿐만 아니라 디폴트 클래스들도 호출 가능
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
