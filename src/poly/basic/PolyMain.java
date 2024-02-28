package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스를 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        //부모타입은 자식을 참조할 수가 있다
        Parent poly = new Child();
        poly.parentMethod(); //호출한 변수의 타입에 따라서 호출할 메소드를 찾음

        //Child child1 = new Parent(); 자식은 부모를 담을 수 없다.
        //자식의 기능을 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod(); //Parent에 차일드 메소드가 없음
        //-> 이런 경우 childMethod() 를 호출하고 싶으면? 캐스팅이 필요
    }
}
