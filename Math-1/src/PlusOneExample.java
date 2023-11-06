import java.util.Arrays;

public class PlusOneExample {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        // If all digits are 9, create a new array with an additional leading 1
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }








    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
        System.out.println(Arrays.toString(plusOne(new int[]{2,1,0})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{8,9,9})));
    }


}