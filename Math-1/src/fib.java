public class fib {
     static  int nFib( int n ){
         int a=0,b=1;
         if(n==0) return 0;
         if(n==1) return 1;
         while(n>1){
             a+=b;
             b=a-b;
             n--;
             System.out.println(a+"---"+b+"----"+n);
         }
         return a;
     }
    public static void main(String[] args) {
        System.out.println(nFib(2));
        System.out.println(nFib(3));
//        System.out.println(nFib(4));
//        System.out.println(nFib(5));
//        System.out.println(nFib(6));
//        System.out.println(nFib(7));
        String x="dw";
        System.out.println((int)'A' - 'A');
    }
}
