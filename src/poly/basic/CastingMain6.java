package poly.basic;
//자바 16부터는 instanceof 를 사용하면서 동시에 변수를 선언할 수 있다.
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    public static void call(Parent parent){
        parent.parentMethod();
        //단점
        //Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child){ //16부터 변수 생성할 수 잇음
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
