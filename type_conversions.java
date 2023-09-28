public class type_conversions {
    public static void main(String[] args){
        //Implicit conversions
        int radius=400;
        double newradius=radius;
        System.out.println("radius value in int: " + radius + " Radius Value in Double : "+newradius); 
        //Explicit conversions
         long diameater=4368829363L;
        int newdiameater=(int)diameater;
        System.out.println("diameater value in double: " + diameater + " diameater Value in int : "+newdiameater);

    }
}
