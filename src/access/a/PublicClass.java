package access.a;

// 퍼블릭 클래스는 반드시 파일명과 일치해야 함
// 한 파일안에 퍼블릭 클래스는 하나만 존재, 디폴트 클래스는 무한정 생성 가능
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1{

}

class DefaultClass2{

}

