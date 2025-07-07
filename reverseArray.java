import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] numbers={89,34,32,21,11};
         for (int i = 0; i < numbers.length / 2; i++) {
            int rev = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = rev;
        }

        System.out.println("" + Arrays.toString(numbers));
        }
        }
    

