abstract class Compartment {
    abstract void notice();
    
}
class FirstClass extends Compartment{
    void notice(){
        System.out.println("First Class");
    }
}class Ladies extends Compartment{
    void notice(){
        System.out.println("Ladies class compoartment");
    }
}
class General extends Compartment{
    void notice(){
        System.out.println("General class compoartment");
    }
}
class Luggage extends Compartment{
    void notice(){
        System.out.println("Luggage class compoartment");
    }
}
public class TestCompartment1{
    public static void main(String[] args) {
        Compartment[] c=new Compartment[10];
        for(int i=0;i<10;i++){
            int r=(int)(Math.random()*4);
            System.out.println("Random number is "+r    );
            if(r==0){
                c[i]=new FirstClass();
            }
            else if(r==1){
                c[i]=new Ladies();
            }
            else if(r==2){
                c[i]=new General();
            }
            else if(r==3){
                c[i]=new Luggage();
            }
            c[i].notice();
        }
    }
}
