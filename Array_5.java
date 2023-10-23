import java.util.Arrays;
import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {
        int n;
        int min;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Total Chocolates Packets : ");
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter Chocolate in " + i + " th packet:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Total Students:");
        m=sc.nextInt();
        Arrays.sort(arr);
        int s=arr[0];
        int c=arr[m-1];
        for(int i=0;i<arr.length;i++) {
            if(i+m-1<arr.length) {
                if(arr[i+m-1]-arr[i]<c-s) {
                    c=arr[i+m-1];
                    s=arr[i];
                }
            }
        }
           System.out.println("Minimum Difference :"+(c-s)); 
    }
}
