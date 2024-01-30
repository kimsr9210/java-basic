package static1;

public class Data3 {
    public String name;
    public static int count; //static //static이 붙은 변수는 메서드 영역에서 관리
    public Data3(String name) {
        this.name = name;
        //Data3.count++;  내 클래스 안에서는 Data3. 생락가능
        count++;
    }
}
