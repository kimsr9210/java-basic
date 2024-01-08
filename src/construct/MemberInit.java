package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age , int grade){ //초기값 설정
        this.name = name; //내 인스턴스에 이름
        this.age = age;
        this.grade = grade;
    }
}
