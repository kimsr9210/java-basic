package final1;
//final 필드 - 생성자 초기화
public class ConstructInit {

    //final을 필드에 사용할 경우에는 생성자를 통해서 값을 할당해야함
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
