//Duplicate array element
import java.util.Arrays;
import java.util.Scanner;
class Array_4{
    public static void main(String[] args) {
       int n;
       boolean flag=false;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter " + i + " th NO:");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
       for(int i=0;i<arr.length-1;i++) {
              if(arr[i]==arr[i+1]){
                  flag=true;
                  break;
              }
              
         }
        System.out.println("Duplicate element :"+flag);

          sc.close();
    }
}
    