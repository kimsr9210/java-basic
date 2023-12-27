package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = crateStudent("학생1", 15, 90);
        Student student2 = crateStudent("학생2", 16, 80);

        printSudent(student1);
        printSudent(student2);
    }

    static Student crateStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    public static void printSudent(Student student){
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
