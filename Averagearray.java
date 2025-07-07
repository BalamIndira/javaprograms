public class Averagearray {
    public static void main(String[] args) {
        int[] numbers={23,12,45,76,90};
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println("Sum:"+sum);
        System.out.println("average:"+sum/numbers.length);
    }
}
