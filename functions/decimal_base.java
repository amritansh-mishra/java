
import java.util.Scanner;
public class decimal_base{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }
    public static int getValueInBase(int n , int b){

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