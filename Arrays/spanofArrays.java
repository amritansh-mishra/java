import java.util.Scanner;


public class SpanOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int [n]; 
        
        for( int i = 0; i < arr.length ; i++){
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for ( int i = 0 ; i < arr.length ; i++){

            if ( arr[i] > max){
                arr[i] = max;
            }
            if ( arr[i] < min){
                arr[i] = min;
            }
        }
        int span = max - min;
        System.out.println("The span of the array is: " + span);
        sc.close();
    }
}