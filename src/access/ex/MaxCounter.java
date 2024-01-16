package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }
    public void increment(){
        //코드가 명확하게 분리됨
        //검증로직
        if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        //실행로직
        count++;

        /* 우리가 친숙한 방식
       if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
       }else{
            count++;
       }
        * */
    }

    public int getCount(){
        return count;
    }
}
