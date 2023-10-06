public class Traffic_Police {
    public static void main(String[] args){
        //IF_ELSE_IF statement
        String signal="red";
        String msg;
        if(signal.equals("red")){
            msg="Stop";
        }
        else if(signal.equals("yellow")){
            msg="Ready";
        }
        else{
            msg="Go";
        }
        System.out.println(msg);

        //TERNERY OPERATOR
        //SYNTAX: (condition)?(true statement):(false statement)
        msg=(signal.equals("red"))?"Stop":(signal.equals("yellow"))?"Ready":"Go";
        
        
    }
}
