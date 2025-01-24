package ref;

public class NullMain1 {
    public static void main(String[] args) {
        // null은 값이 존재하지 않는다는 뜻
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
