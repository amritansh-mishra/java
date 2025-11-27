package Basic;
import java.util.Scanner;
public class all_prime_no_till_N {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int n = low; n <= high;  n++){
            int count = 0;
            for(int div=2; div*div<=n; div++){    // 2 to sqrt(n),(div*div=n) cause koi bhi number ka factor uske sqrt se bada nahi hota

                if ((n%div) == 0){

                    count++;
                    break;
                }
            }

          if (count == 0){
           System.out.println(n);
            }    
        }
    }    
}

