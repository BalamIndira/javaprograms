public class minimumarray {
    public static void main(String[] args) {
        int[] numbers={89,32,23,6,34,2,65,76};
        int min=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Minimum element"+min);
    }
}
