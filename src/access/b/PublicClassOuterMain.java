package access.b;

// import access.a.DefaultClass1;
// import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 디폴트 클래스는 다른 패키지에서 접근 불가
        // DefaultClass1 defaultClass1 = new DefaultClass1;
        // DefaultClass2 defaultClass2 = new DefaultClass2;
    }
}
