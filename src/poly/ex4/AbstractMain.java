package poly.ex4;


public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
        //AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        movwAnimal(dog);
        movwAnimal(cat);
        movwAnimal(caw);
    }

    //변하지 않는 부분
    public static void soundAnimal(AbstractAnimal abstractAnimal){
        System.out.println("동물 소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //변하지 않는 부분
    public static void movwAnimal(AbstractAnimal abstractAnimal){
        System.out.println("동물 움직임 테스트 시작");
        abstractAnimal.move();
        System.out.println("동물 움직임 테스트 종료");
    }
}
