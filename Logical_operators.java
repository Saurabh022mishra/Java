public class Logical_operators {
    public static void main(String[] args){
        //Logical Operators
        boolean isAdult=true;
        boolean isStudent=!isAdult;
        System.out.println(isStudent);
        
        int a=3;
        int b=7;
        System.out.println(a<b && a>b);//False
        System.out.println(a<b || a>b);//True
        System.out.println(!(a<b && a>b));//True
        System.out.println(!(a<b || a>b));//False
    }
}
