package poly.ex3;

public class Dog extends AbstractAnimal{
    @Override
    public void sound() { //불안전한 추상 메서드를 자식이 구현함
        System.out.println("멍멍");
    }
}
