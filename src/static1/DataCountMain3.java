package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        // static 변수(클래스 변수)는 메서드 영역에서 관리
        // 해당 클래스의 모든 인스턴스가 공유하는 변수
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 인스턴스를 통한 접근(권장되는 방식X) 인스턴스 변수인지 static 변수인지 알기 어려움
        // static 변수는 인스턴스에 저장되는 변수가 아니기 때문에
        // 실제로는 인스턴스에 접근한 후 해당 변수가 static인걸 확인하면 그제서야
        // 메서드 영역으로 가서 해당 클래스의 static변수를 찾음
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.count);

        // 클래스를 통한 접근
        System.out.println("E count = " + Data3.count);
    }
}
