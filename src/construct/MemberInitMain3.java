package construct;


import static construct.MemberInitMain2.initMember;

public class MemberInitMain3 {
    public static void main(String[] args) {
        // 인스턴스 메서드를 통해서 기능과 속성을 하나로 묶었음
        // 하지만 초기화 메서드를 매번 호출해야 하는 문제 발생
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);
        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for(MemberInit member: members){
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }
}
