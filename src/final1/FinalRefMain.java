package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //참조형 변수에 final을 걸음 => 다른 객체를 참조하지 못함
        //참조형 변수에 들어 있는 참조값만 변경하지 못 함
        //data = new Data();  이미 할당을 했기 때문에 참조 대상을 변경 할 수 없음

        //데이터 자신을 바꾸는게 안되는것이지
        //참조 대상의 객체의 값은 변경 가능 
        //왜냐 data.value는 final이 아니기 때문
        data.value = 10;
        System.out.println(data.value);

        data.value = 20;
        System.out.println(data.value);
    }
}
