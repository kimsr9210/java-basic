package poly.ex2;
//AnimalPolyMain2 보다 좀 더향상된 코드
public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalAll = {new Dog(), new Cat(), new Caw(), new Pig()};

        //for문 단축키 iter
        for (Animal animal : animalAll) {
            soundAnimal(animal);
        }
    }

    //변하지 않는 부분
    public static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //위 코드의 문제점 2가지.
    //Animal 클래스를 생성할 수 있는 문제
    //Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성
}
