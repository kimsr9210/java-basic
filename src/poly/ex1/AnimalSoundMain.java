package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args){
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();
        //Dog dog1 = new Cat(); //다른 클래스 다른 타입 이기 때문에 넣을 수 없다
        //Dog , Cat , Caw 가 모두 같은 타입을 사용할 수 있는 방법이 있다면
        //메서드와 배열을 활용해서 코드의 중복을 제거할 수 있다는 것.

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
