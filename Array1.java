 //WAP to split the array of twenty integers into odd and even numbers and find the sum of the third largest 
 //element from odd and even array. Take user input.
 import java.util.Scanner;
import java.util.Arrays;
public class Array1 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize arrays for odd and even numbers
        int[] oddArray = new int[20];
        int[] evenArray = new int[20];
        
        int oddCount = 0;
        int evenCount = 0;
        
        // Input 20 integers from the user
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenArray[evenCount++] = num;
            } else {
                oddArray[oddCount++] = num;
            }
        }
        
        // Sort the arrays in descending order
        Arrays.sort(oddArray, 0, oddCount);
        Arrays.sort(evenArray, 0, evenCount);
        
        // Calculate the sum of the third largest element from both arrays
        int oddSum = 0;
        int evenSum = 0;
        
        if (oddCount >= 3) {
            oddSum = oddArray[oddCount - 3];
        }
        
        if (evenCount >= 3) {
            evenSum = evenArray[evenCount - 3];
        }
        
        int totalSum = oddSum + evenSum;
        
        // Display the results
        System.out.println("Sum of the third largest odd number: " + oddSum);
        System.out.println("Sum of the third largest even number: " + evenSum);
        System.out.println("Total sum: " + totalSum);
        
        scanner.close();
    }
}


