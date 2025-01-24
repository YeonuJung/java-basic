package ref;

public class VarChange2 {
    public static void main(String[] args) {
        // 참조값은 변수에 들어있는 참조값만 복사해서 대입하기 때문에 dataA와 dataB의 참조값은 동일하다
        // 따라서 dataA의 value를 변경하면 dataA와 dataB의 동일한 참조값 내부의 멤버변수를 변경한 것이기 때문에
        // dataA와 dataB의 value 모두 변경된다.
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;


        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20;");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30;");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

    }
}
