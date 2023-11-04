import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        long num =0;
        for ( int i:digits){
            num*=10;
            num+=i;
        }// 124

        num+=1l;
        System.out.println(num);
        int len= String.valueOf(num).length();
        int new_num[]= new int[len];
        System.out.println(len+"------$$$----");
        System.out.println(new_num.length);
        String tmp= Long.toString(num);
        for ( int i=len-1;i>=0;i--){
            new_num[i]= tmp.charAt(i) - '0';
            num/=10;
        }
        return new_num;
    }

    public static void main(String[] args) {
        int max= Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max+"---"+min);

        System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }


}