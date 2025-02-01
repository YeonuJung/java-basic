package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("abcd123", "루돌프");
        member.print();
        member.changeData("산타루돌프");
        member.print();
    }
}
