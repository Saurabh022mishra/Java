import java.util.Scanner;
public class CoreJavaMod1Assign {
    public static void main(String args[]){
        String group="";
    Scanner a=new Scanner(System.in);
 System.out.println("Enter your name");
    String name=a.nextLine();
    System.out.println("Enter your age");
    int age=a.nextInt();
    System.out.println("Enter your Blood Group Name");
    String blood=a.next();
    
    if(age>=20){
group="RED";

    }
else if(age>=15 && age<20){
    group="BLUE";
}
else if(age>=10 && age<15){
    group="YELLOW";
}
System.out.println("----------------------------------------");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Blood Group: " + blood);
System.out.println("----------------------------------------");
System.out.println("Your group is "+group);
System.out.println("----------------------------------------");
a.close();
    }}
