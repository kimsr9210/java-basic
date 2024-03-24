package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    //동물이 추가되어도 변하지 않는 코드
    public static void soundAnimal(Animal animal){ //부모는 자식을 담을 수 있음 //ex) Animal animal = dog
        //하위타입의 오버라이딩 된 메소드가 있다면, 그러면 오버라이딩 된 메소드가 *무조건 우선순위를 가짐 그래서 멍멍이 출력되는 것.
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //오버라이딩된 메서드가 호출 됨
        System.out.println("동물 소리 테스트 종료");
    }
}
