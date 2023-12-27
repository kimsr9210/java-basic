package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData(); //new 해가지고 만들면 class 안에 있는 값들을 초기화 됨
        System.out.println("data.value1 :"+ data.value1);
        System.out.println("data.value2 :"+ data.value2);
    }
}
