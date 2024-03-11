package poly.basic;
//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child(); //업 캐스팅 //캐스팅 생략가능
        Child child1 = (Child) parent1; //다운 캐스팅
        child1.childMethod(); //문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류 - ClassCastException -> 클래스 캐스트 잘못했어
        child2.childMethod(); //실행 불가
        //메모리상에 Child가 존재하지 않음
        //child 메소드 사용 불가
    }
    
}
