package pack;

import pack.a.*;
public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); //둘이 같은 패키지에 있으면 클래스 이름으로 불러다 쓰면됨
        User user = new User();
        User2 user2 = new User2();
    }
}
