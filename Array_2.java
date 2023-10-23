//Reversed Array
import java.util.Scanner;

public class Array_2 {
    public Array_2() {
    }

    public static void main(String[] args) {
        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n + 1];

        int i;
        for(i = 0; i < n; ++i) {
            System.out.println("Enter " + i + " th NO:");
            arr[i] = sc.nextInt();
        }

        for(i = arr.length - 1; i >= 0; --i) {
            rev[j] = arr[i];
            ++j;
        }

        for(i = 0; i < rev.length - 1; ++i) {
            System.out.print(rev[i] + " ");
        }

    }
}