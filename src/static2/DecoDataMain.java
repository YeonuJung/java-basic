package static2;


public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); // static value = 1

        System.out.println("2. 인스턴스 호출");
        DecoData decoData = new DecoData();
        decoData.instanceCall(); // instance value = 1, static value = 2

        System.out.println("3. 인스턴스 호출");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall(); // instance value = 1, static value = 3

        //인스턴스를 통한 접근
        DecoData decoData3 = new DecoData();
        decoData3.staticCall();
        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
