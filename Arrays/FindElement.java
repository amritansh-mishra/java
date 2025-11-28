package Arrays;

public class FindElement {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int [n]; 
        
        for( int i = 0; i < arr.length ; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the element to be found: ");
        int target = sc.nextInt();      

        int index = -1;
        for ( int i = 0 ; i < arr.length ; i++){

            if ( arr[i] == target){
                index = i;
                break;
            }
        }
        if ( index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + index);
        }
        sc.close();
    }
    
}
