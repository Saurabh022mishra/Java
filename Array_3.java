import java.util.Scanner;

//.Maximum-Subarray
public class Array_3 {
    public static void main(String[] args) {
        int n;


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter " + i + " th NO:");
            arr[i] = sc.nextInt();
        }
        int sum=arr[0];
        int maxsum=arr[0];
        for(int i=0;i< arr.length;i++){
            if(sum>=0){
                sum=sum+arr[i];
            }
            else{
                sum=arr[i];
            }
            if(sum>maxsum){
                maxsum=sum;
            }

        }
        System.out.println("Maximum sum :"+maxsum);
        sc.close();
    }
}
