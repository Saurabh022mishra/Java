public class bubbleShort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 88, 87, 86, 85, 84 };

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Pass Number: " + " " + i + "-------->");

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                     printArray(arr);
              }
        }
    }
 } 

}
