//Maximum Minimum in an array
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i;
        for(i = 0; i < n; ++i) {
            System.out.println("Enter " + i + " th NO:");
            arr[i] = sc.nextInt();
        }

        int high;
        int low;
        if (arr[0] > arr[1]) {
            high = arr[0];
            low = arr[1];
        } else {
            high = arr[1];
            low = arr[0];
        }

        for(i = 2; i < arr.length; ++i) {
            if (arr[i] > high) {
                high = arr[i];
            } else if (arr[i] < low) {
                low = arr[i];
            }
        }

        System.out.println(high + " " + low);
        sc.close();
    }
    
}
