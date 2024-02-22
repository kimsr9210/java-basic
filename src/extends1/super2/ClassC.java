package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        //생성자는 하나만 호출 할 수 있다
        //ClassB는 기본생성자가 없다. 그래서 super(); 생략 가능하다
        super(10, 20); //부모에게 10,20 파라미터 전달
        System.out.println("ClassC 생성자");        
    }
    
}
