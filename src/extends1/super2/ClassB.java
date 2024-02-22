package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a){
       //super(); //매개변수가 없는 기본 생성자의 경우에는 생력하면 자바가 자동으로 만들어줌 => 기본 생성자 생략가능
        System.out.println("ClassB 생성자");
    }

    public ClassB(int a, int b){
        //super(); //기본 생서자 생략가능
        System.out.println("ClassB 생성자 a="+a + " b=" + b);
    }
}
