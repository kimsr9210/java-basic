package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출 할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모타입 -> 자식타입)
        Child child = (Child) poly; //x001 //강제로 타입을 바꿔서 대입 할 수 있음
        child.childMethod();
    }
}