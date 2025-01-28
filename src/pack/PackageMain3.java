package pack;
// import pack.a.User 코드 첫줄에는 항상 패키지를 명시하고 그 다음부터 import 사용가능

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();

        // 동일한 이름의 클래스를 서로 다른 패키지에서 불러올 때는 하나를 import하면
        // 다른 하나는 .을 사용해서 불러와야 함
        // 그래서 이런 경우 자주 사용하는 클래스를 import해서 쓰고 나머지 클래스는 .으로 불러옴
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}

