public class CompileTimeException {
    public static void main(String[] args)throws InterruptedException {

        try{
        Thread.sleep(1000);
        }
        //catch block is not required because it is a compile time exception
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(9/2);


    }
}
