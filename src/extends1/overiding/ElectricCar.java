package extends1.overiding;

public class ElectricCar extends Car {

    @Override //어노테이션 => method overriding 메소드 재정의
    public void move (){
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    
    public void charge() {
        System.out.println("충전합니다.");
    }
}
