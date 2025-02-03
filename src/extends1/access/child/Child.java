package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1; // public이라서 외부에서 접근 가능
        protectedValue = 1; // 패키지가 다르지만 상속관계이기 때문에 protected 접근 가능
        // defaultValue = 1; 패키지가 다르기 때문에 접근 불가
        // privateValue = 1; private이기 때문에 접근 불가

        publicMethod(); // public이라서 외부에서 접근 가능
        protectedMethod(); // 패키지가 다르지만 상속관계이기 때문에 protected 접근 가능
        // defaultMethod(); // 패키지가 다르기 때문에 접근 불가
        // privateMethod(); // private이기 때문에 접근 불가

        printParent();
    }
}