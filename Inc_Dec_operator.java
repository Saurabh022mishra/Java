public class Inc_Dec_operator {
    public static void main(String[] args){
        //Postfix 
        int year =10;
        int newYear=year++;
        System.out.println("New Year is :"+newYear);
        System.out.println("Year is :"+year);
        //Prefix
        int year1 =10;
        int newYear1=++year1;
        System.out.println("New Year is :"+newYear1);
        System.out.println("Year is :"+year1);
    }
}