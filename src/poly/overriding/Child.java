package poly.overriding;

public class Child extends Parent {
    public String value = "child";
    //오버라이드 단축키 컨+o
    @Override //자식은 재정의
    public void method() {
        System.out.println("Child.method");
    }
}
