package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 dafault 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가
        // data.privateField = 3;
        // data.privateMethod();

        // innerAccess 자체는 public 이기 때문에 외부에서 호출 가능
        // innerAccess는 AccessData의 메서드이기 때문에 자신의 모든 필드에 접근 가능
        data.innerAccess();
    }
}
