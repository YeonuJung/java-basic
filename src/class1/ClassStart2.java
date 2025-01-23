package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // 배열로 하면 각각을 변수로 만들때보다 편리하지만 여전히 각 학생의 데이터가 나누어져 있다.
        // 즉 데이터가 분산되어 있기 때문에 데이터를 관리하기 좋은 방식이 아니다.
        // 그래서 클래스를 사용하면 분산된 데이터를 하나로 묶어서 이러한 문제를 해결할 수 있다.
        String[] names = {"학생1", "학생2"};
        int[] ages = {15, 16};
        int[] grades = {90, 80};

        for(int i = 0; i < names.length; i++){
            System.out.println("이름: " + names[i] + " 나이: " + ages[i] + " 성적: " + grades[i]);
        }
    }
}
