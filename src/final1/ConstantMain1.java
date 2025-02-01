package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        // 값이 고정되고, 여러곳에서 사용되는 경우 상수로 관리(static final)
        // 상수를 통해 변수를 중앙에서 직접 관리하고 처리 가능
        // 즉, 한곳에서 관리하기 때문에 변경이 쉽다
        // 그리고 해당 숫자가 무슨 역할을 하는지 이해하기 쉬움(매직 넘버 문제 해결)
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        }else{
            System.out.println("게임에 참여합니다.");
        }
    }
}