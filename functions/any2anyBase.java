package functions;

public class any2anyBase {
 public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int d  = getValueInBase(n, b1 , b2);
        System.out.println(d);
    }
    public static int getValue(int n , int b1 , int b2 ){

        int dec = anybaseToDecimal(n , b1);
        int anyBase = decimalToAnyBase(dec , b2);
        return anyBase;
    }

    public static int decimalToAnyBase(int n , int b){

        int rv = 0;

        int pow = 1;
        while (n > 0) {
           int dig = n % b;
           n = n / b;
           rv += dig * pow;
           pow = pow * 10;
        }
        return rv;

    }

    public static int anybaseToDecimal(int n , int b){

        int rv = 0;

        int pow = 1;
        while (n > 0) {
           int dig = n % 10;
           n = n / 10;
           rv += dig * pow;
           pow = pow * b;
        }
        return rv;

    }
    
}     
