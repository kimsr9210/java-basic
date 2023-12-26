package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); //참조값
        dataA.value = 10;
        System.out.println("메소드 호출 전 : dataA.value =" + dataA.value);
        System.out.println("dataA="+dataA);
        changeReference(dataA);
        System.out.println("메소드 호출 전 : dataA.value =" + dataA.value);
    }

    //int dataX = dataA; //dataX를 통해서도 x001(주소값)에 있는 Data  인스턴스에 접근할 수 있다.
    static void changeReference(Data dataX){
        System.out.println("dataX="+dataX);
        dataX.value = 20;
    }
}
