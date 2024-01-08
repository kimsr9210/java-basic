package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //() 객체를 생성해라
        //그러면서 동시에 이 생성자를 불러라

        //new MemberConstruct() 객체생성
        //생성이 메모리에 만들어 지자 마자 호출 new MemberConstruct("user1", 15, 90);
        //객체를 생성하면서 메모리를 할당하고 생성자를 바로 부름
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); // Ctrl+p 파라미터 먼지 볼 수 있는 단축키
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members =  {member1, member1};

        for(MemberConstruct s : members){
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
