package poly.ex3;

public abstract class AbstractAnimal {

    //추상 메소드가 하나라도 있으면 클래스는 추상 클래스 여야됨
    //바디부분을 선언x 반드시 자식클래스가 오버라이딩 해야한다 안그럼 컴파일 오류
    //만약 자식이 오버라이딩을 하지 않을경우 자식 클래스에도 abstract를 붙여야 한다. 자식도 추상 클래스가 되어야 된다는 뜻

    //자식이 반드시 오버라이딩 해야 되는 목적으로 만듬
    public abstract void  sound();

    //자식이 기능을 상속받아서 사용하는 목적
    public void move(){
        System.out.println("동물이 움직입니다.");
    }

}
