package final1;
//final 필드 - 필드 초기화
public class FieldInit {
    static final int CONST_VALUE = 10; //클래스에 바로 접근해서 사용
    final int value = 10; //초기값을 넣어버린 경우엔 생성자를 통해서 값을 지정하지 않음 , 값을 바꿀 수 없음
}
