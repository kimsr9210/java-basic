package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생략 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Caw caw = new Caw();
        Cat cat = new Cat();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    public static void soundAnimal(InterfaceAnimal interfaceAnimal){
        System.out.println("동물 소리 테스트 시작");
        interfaceAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
