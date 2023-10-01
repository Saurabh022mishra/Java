public class Operator_Precedence {
    public static void main(String[]args){
        int result=3+1-7*5%3/2;//left to right(* / % )>(+ -)
        System.out.println(result);
         // 3+1-7*5%3/2
            // 3+1-35%3/2
                // 3+1-2/2
                    // 3+1-1
                        // 4-1
                            // 3

    }
}
