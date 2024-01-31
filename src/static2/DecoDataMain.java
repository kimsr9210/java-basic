package static2;

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
    }
}
