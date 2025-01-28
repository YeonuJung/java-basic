package pack;
// import pack.a.User 코드 첫줄에는 항상 패키지를 명시하고 그 다음부터 import 사용가능
import pack.a.*; // <- 이렇게 * 를 사용하면 전체 클래스를 불러올 수 있음

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();

        // 다른 패키지에서 클래스를 불러올 때 .을 하나하나 쳐주는 것이 불편하기 때문에
        // import를 통해서 해당 패키지의 클래스를 불러옴
        User user = new User();
        User2 user2 = new User2();
    }
}

