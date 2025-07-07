public class maximumarray {
    public static void main(String[] args) {
        int[] numbers={21,23,45,65,76,86,85};
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Maximum element:"+max);
    }
}
