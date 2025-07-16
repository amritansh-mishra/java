package Basic;
import java.util.Scanner;

public class PrintingDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to print digits of:");
        int number = scanner.nextInt();

        while (number != 0) {
            int digit = number % 10;  // get last digit
            number /= 10;             // remove last digit
            System.out.println(digit);
        }

        scanner.close();
    }
}