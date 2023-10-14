public class Factorial {
    // WAP to print the factorial using while loop
    public static void main(String[] args) {
        int i = 1, fact = 1;
        while (i <= 5) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of 5 is " + fact);
    }
}
