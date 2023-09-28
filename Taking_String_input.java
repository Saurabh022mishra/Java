import java.util.Scanner;
public class Taking_String_input {
    public static void main(String[] args){
        String name;
        int population;
        float population_density;
        double GDP;
        char currency;
        boolean isSecular;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  country name of the country");
        name=sc.nextLine();
        System.out.println("Enter the population of the country");
        population=sc.nextInt();
        System.out.println("Enter the population density of the country");
        population_density=sc.nextFloat();
        System.out.println("Enter the GDP of the country");
        GDP=sc.nextDouble();
        System.out.println("Enter the currency of the country");
        currency=sc.next().charAt(0);
        System.out.println("Enter the country is secular or not");
        isSecular=sc.nextBoolean();
        System.out.println("Your Country Name is : "+name);
        System.out.println("Your Country Population is : "+population);
        System.out.println("Your Country Population Density is : "+population_density);
        System.out.println("Your Country GDP is : "+GDP);
        System.out.println("Your Country Currency is : "+currency);
        System.out.println("Your Country is Secular or not : "+isSecular);
        sc.close();
    }
    
}
