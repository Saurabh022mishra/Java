public class Exception_Handling {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int [] myArray={3,45,8,10};
        try {
        System.out.println(myArray[10]);
        } catch (Exception e) {
            System.out.println("Arrays Index Error: " + e.getMessage());
        }
        System.out.println("Program Ends");
    }
}
