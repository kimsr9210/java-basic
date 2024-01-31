package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue; //클래스변수, 정적변수,static변수 라고 부름

    //static 메소드 static만 사용 할 수있음
    //static이 없는 인스턴스 변수나 메서드는 접근x
    public static void staticCall(){
        //인스턴스 변수는 인스턴스를 생성해야 함
        //그리고 참조값을 알아야 함 참조값을 알수가 없기 때문에 실행이 안됨 
        //instanceValue++; //인스턴스 변수 접근, complie error
        //intanceMethod(); //인스턴스 메서드 접근, complie error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    //static 메소드
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.intanceMethod();
    }

    //static이 없음 인스턴스를 생성해야 부를 수 있음
    //모든 곳에서 공용인 static을 호출 할 수 있음
    public void intanceCall(){
        instanceValue++; //인스턴스 변수 접근
        intanceMethod(); //인스턴스 메서드 접근, complie error

        //DecoData.staticValue++; //본인 클래스 안에서 사용한 거기 때문에, DecoData. 생략가능
        //DecoData.staticMethod();
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    //인스턴스 메소드
    private void intanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    //static 메소드
    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
