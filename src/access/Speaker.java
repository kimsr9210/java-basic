package access;

public class Speaker {
    //필드
    private int volume; //private 개인적

    //생성자
    //생성자를 통해서 초기 음량 값을 지정 할 수 있다.
    Speaker(int volume){
        this.volume = volume;
    }

    //메서드
    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가 할 수 없습니다. 최대 음량입니다.");
        } else{
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown(){
        volume-= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume(){
        System.out.println("현재 음량" + volume);
    }
}
