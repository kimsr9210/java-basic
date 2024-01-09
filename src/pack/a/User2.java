package pack.a;

public class User2 {
    public User2(){ //생성자

        //생성자에 public을 사용했는데
        //다른 패키지엣 ㅓ이 클래스의 생성자를 호출을 하려면 이 생성자가 public이여야 함
        System.out.println("패키지 pack.a 회원2 생성");
    }
}
