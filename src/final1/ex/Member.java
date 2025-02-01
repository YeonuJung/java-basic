package final1.ex;

public class Member {

    private final String id; // final 키워드 사용
    private  String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void changeData(String name){
        // this.id = id; // id를 final로 설정했기 때문에 초기화 이후 변경 불가
        this.name = name;
    }

    public void print() {
        System.out.println("id : " + id +  ", name :"  + name);
    }
}
