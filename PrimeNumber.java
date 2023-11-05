public class PrimeNumber {
    //WAP to input a number and check if it is prime or not
    public static void main(String[] args) {
        int num = 7, i = 2;
        while (i < num) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                break;
            }
            i++;
        }
        if (i == num) {
            System.out.println("Prime number");
        }
    }
}
