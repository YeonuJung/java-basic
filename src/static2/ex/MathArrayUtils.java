package static2.ex;

public class MathArrayUtils {

    // 인스턴스 생성을 막기 위해서 private으로 접근 제어
    private MathArrayUtils(){

    }

    public static int sum(int[] array){
        int total = 0;
        for(int num : array){
            total += num;
        }
        return total;
    }

    public static double average(int[] array){
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            min = num < min ? num : min;
        }
        return min;
    }

    public static int max(int[] array){
        int max = array[0];
        for(int num : array){
            max = num > max ? num : max;
        }
        return max;
    }
}
