package static2.ex;

public class MathArrayUtils {

    //실수로 생성하지 못하게 제공하는 입장에서 제약을 제공해 주어야함
    //생성을 하지 못하게 private로 생성을 막아야함
    private MathArrayUtils(){
        //private 인스턴스 생성을 막는다
    }

    public static int sum(int[] values) {
        int total = 0;
        for(int v : values){
            total += v;
        }
        return total;
    }


    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for(int i = 1; i < values.length; i++){
            min = Math.min(min, values[i]);
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for(int i = 1; i < values.length; i++){
            max = Math.max(max, values[i]);
        }
        return max;
    }
}
