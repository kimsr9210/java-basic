package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";

        String deco = DecoUtil2.deco(s); //정적 메서드는 정적 변수처럼 객체(인스턴스)생성 없이 클래스 명을 통해서 바로 호출 가능

        System.out.println("befor : " + s);
        System.out.println("after : " + deco);
    }
}
