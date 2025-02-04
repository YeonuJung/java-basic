package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        // 다운캐스팅을 수행하기 전에는 먼저 instanceof를 사용해서 원하는 타입으로 변경 가능한지 확인
        // instanceof의 경우 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우 true 반환
        Parent parent1 = new Parent();
        System.out.println("Parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("Parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();

        if(parent instanceof Child){
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.ChildMethod();
        }else{
            System.out.println("Child 인스턴스 아님");
        }
    }
}
