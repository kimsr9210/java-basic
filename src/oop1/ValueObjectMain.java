package oop1;


public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject(); //ValueData에 메소드도 사용 가능
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자 = " + valueObject.value);
    }
}
