package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 하나 더 추가
    MemberConstruct(String name, int age){ //생성자 오버로딩
        //자기 자신의 생성자를 호출
        //중복 제거
        this(name, age, 50); //변경
    }

    /*생성자
    생성자는 메서드와 비슷하지만 다음과 같은 차이가 있다.
    -생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글짜도 대문자로 시작
    -생성자는 반환타입이 없다 비워두어야 한다
    -나머지는 메서드와 같다
    * */
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
