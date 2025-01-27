package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    // 생성자는 메서드와 유사하지만 클래스 이름과 같아야 한다. 따라서 첫글자도 대문자
    // 반환 타입이 없고 비워두어야 한다.
    // 나머지는 메서드와 같다.

    // 추가(생성자 오버로딩)
    MemberConstruct(String name, int age){
        this(name, age, 50);
        /*
        아래와 같이 초기화하면 중복로직이 생기기 때문에 this()를 통해
        클래스의 다른 생성자를 호출할 수 있음
        this()는 생성자 내부에서 첫줄에만 작성 가능

        this.name = name;
        this.age = age;
        this.grade = 50;
         */
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ", age =" + age + ", grade =" + grade);
        this.name = name;
        this.age = age;
        this.grade =grade;
    }
}
