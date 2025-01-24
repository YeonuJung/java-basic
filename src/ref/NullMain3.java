package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        // NullPointerException
        // bigData의 data는 참조형이므로 null로 초기화 됨
        // null의 value는 없기에 NullPointerException 발생
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
