package construct;


public class MemberInitMain2 {
    public static void main(String[] args) {
        // 초기값 설정하는 로직을 메서드로 추출해서 반복되는 부분 해결
        // 하지만 여전히 기능과 속성이 분리되어 있음
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);


        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for(MemberInit member: members){
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }
    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }

}
