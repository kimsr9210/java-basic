package extends1.super1;

public class Child extends Parent{
    public String value = "child";

    public void hello(){
        System.out.println("child.hello");
    }

    public void call(){
        System.out.println("super.value => " + super.value);
        System.out.println("this.value => " + this.value);

        super.hello();
        this.hello(); //this 생략 가능
    }
}
