package poly.basic;
//upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 생략 가능, 생략 권장 워낙 많이 사용하기 때문에 //자바가 자동으로 변환해줌
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
