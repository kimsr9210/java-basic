package static1;

public class DataCountMain3 {
    public static void main(String[] args){
        Data3 data1 = new Data3("A"); //힙영역에서 관리
        System.out.println("A count" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count" + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D"); 
        System.out.println(data4.count); //권장 안함 => 인스턴스 변수인가? 라는 오해의 소지가 생김

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }

}
