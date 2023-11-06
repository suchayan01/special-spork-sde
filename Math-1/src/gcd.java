public class gcd {

    static int gcd( int a, int b){
        System.out.println(a+"----"+b);
        if ( a==0) return b;
        if(b==0) return a;
        return a>b? gcd(a-b,b):gcd(b-a,a);

    }

    static int gcd_mod(int a, int b){
        if(b==0){
            return a;
        }
        return gcd_mod(b,b%a);
    }



    public static void main(String[] args) {
        System.out.println(gcd(1,11));
//        System.out.println(gcd_mod(52,10));
    }
}
