package poly.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() { //불안전한 추상 메서드를 자식이 구현함
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개가 움직입니다.");
    }
}
