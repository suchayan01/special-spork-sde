public class nums {
    public static void main(String[] args) {
//        int  num =1234;
//        System.out.println(Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0))));
//        System.out.println(num/1000);
//        int len = String.valueOf(num).length();
//        while(num>0){
//            System.out.println(num/(10*len));
//            num%=10*len;
//            len--;
//        }

        int num = 12345678;  // The original number
        int n = 4;          // Number of digits to extract
        int divisor = (int) Math.pow(10, Integer.toString(num).length() - n);  // Calculate the divisor

        int extractedDigits = num / divisor;  // Extract the leftmost n digits

        System.out.println("Original Number: " + num);
        System.out.println("Extracted Digits: " + extractedDigits);
    }
}
