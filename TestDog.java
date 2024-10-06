public class TestDog {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.color="black";
        dog1.size=40;
        dog1.breed="labrador";
        System.out.println("Dog1: "+dog1.color+" "+dog1.size+" "+dog1.breed);
        dog1.bark();
        dog1.run();
    }
}
