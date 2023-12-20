package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        //객체 도입
        Student student1; //학생을 담을 수 있는 변수 선언

        //new 실제 메모리에 학생과 관련된 데이터를 메모리에서 확보함 => 객체 또는 인스턴스라고 함
        student1 = new Student(); //학생을 실제 메모리에 만들음
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        student1.age = 31;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name+ "나이:" + student1.age + "성적 :" + student1.grade);
        System.out.println("이름 :" + student2.name+ "나이:" + student2.age + "성적 :" + student2.grade);
    }
}
