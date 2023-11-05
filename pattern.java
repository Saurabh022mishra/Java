import java.util.Scanner;
public class pattern {
    public static void main(String[]args){
        int n = 0;
        System.out.println("Enter the number of rows");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        { 
            int i, j; 
      
           
            for (i = n; i >= 1; i--) { 
      
                 
                for (j = 1; j < i; j++) { 
                    System.out.print(" "); 
                } 
      
               
                for (j = 0; j <= n - i; j++) { 
                    System.out.print("*"); 
                } 
      
                System.out.println(); 
            } 
        } 
        scanner.close();
    }
}
