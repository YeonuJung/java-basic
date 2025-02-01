package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10; // 이렇게 사용하는 것은 비권장(인스턴스 생성마다 동일한 값이 생성되기에 메모리 낭비)
    // 따라서 final변수를 필드에서 초기화 하는 경우 static으로 사용하는 것이 좋음
}
