package poly.ex2;
/*
앞서 설명한 예제를 다형성을 사용하도록 변경
부모를 만들고 자식들이 상속 받도록 만듬
*/
public class Animal {

    //오버라이딩 해서 사용할 목적으로 만듬
    public void sound(){
        System.out.println("동물 울음 소리");
    }
}
