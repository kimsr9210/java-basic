package static2;

//DecoData에서 알트+엔터 import static 할 수 있음
//클래스 명을 생략 하고 메소드를 사용할 수 있음
//import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); //staticValue는 원래 클래스 레벨에 있었기 때문에 겂이 증가함

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.intanceCall(); //인스턴스는 새로 생성이기 때문에 instanceValue 값이 1

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.intanceCall();


        //외부에서 참조값을 넘겨오기 때문에 실행됨 참조값을 통해서 접근하는거 됨
        DecoData.staticCall();

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        //인스턴스에 스테틱 메소드를 호출해서 가져옴
        //인스턴스 메서드처럼 보여서 이방법 x 명확하게 명시해 줘야함
        data3.staticCall();


        //클래스를 통한 접근 static 메소드구나 ~
        DecoData.staticCall();
    }
}
