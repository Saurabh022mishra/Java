public class String_Comparison {
    public static void main(String[] args) {
        // String comparison
        //Index           0   1   2   3   4   5   6  ----->length of 7
       char[] myArray = {'W','e','l','c','o','m','e'};
       //Using Literals to create a string
       String firsdString="Welcome";//s1
       String secondString="Welcome";//s1
       //Using new keyword to create a string
       String thirdString = new String("Welcome");//s2
       System.out.println(firsdString==secondString);//compair two objects... true
         System.out.println(firsdString==thirdString);//compair two objects.. false
         System.out.println(firsdString.equals(thirdString));//true
       System.out.println(myArray.length);
         System.out.println(firsdString.length());


    }
}
