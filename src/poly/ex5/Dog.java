package poly.ex5;

public class Dog implements InterfaceAnimal{
    //인터페이스는 implements를 사용함 implements는 구현 이라함
    //부모를 물려받았떠니 내가 다 구현해야하네!
    //자바에서 정한 약속
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 달려가요");
    } 

}
