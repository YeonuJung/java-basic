package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 이렇게 생성자를 활용하면 중복 호출을 제거할 수 있다.
        // 메서드를 직접 호출할 필요 X
        // 뿐만 아니라 생성자를 정의해놓으면 반드시 정의해놓은 방식대로 호출해야 함.
        // 그렇기 때문에 정보가 누락되는 문제를 방지할 수 있다.
        // 만약 생성자를 정의하지 않으면 자바가 알아서 매개변수가 없는 기본 생성자를 만들어줌
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};
        for(MemberConstruct member : members){
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);

        }
    }
}
