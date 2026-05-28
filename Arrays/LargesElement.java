class LargesElement {

    static int findLargest(int[] arr) {

        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 7, 2, 3};

        System.out.println(findLargest(arr));
    }
}