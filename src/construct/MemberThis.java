package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; //nameField 는 앞에 this 가 없어도 멤버 변수에 접근한다.
        //this.nameField = nameParameter; 옛날스타일 , 코드가 좀 더 명확 , 좀 더 잘 구분하려고 사용했음
    }
}
