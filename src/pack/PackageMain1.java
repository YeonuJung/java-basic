package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        // 다른 패키지에서 클래스를 불러올 때 .을 사용해주어야 한다.
        // 하지만 이 방식은 매우 불편함
        pack.a.User user = new pack.a.User();
    }
}
