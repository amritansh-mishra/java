class SecondLargest {
    static int FindSecond( int arr []){

        int largest = arr [0];
        int secondlargest = -1;

        for ( int i =0 ; i< arr.length ; i++){
            if ( arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }

            else if ( arr[i] > secondlargest && arr[i] != largest){
                   secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
         int arr [] = { 10, 10 ,10 ,10};
        // int arr [] = { 8,9 ,3, 2};
        System.out.println(FindSecond(arr));
    }
}


