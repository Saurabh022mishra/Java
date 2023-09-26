public class Single_tasK_single_thread extends Thread{
    public void run(){
        System.out.println("Task One>>>>");
    }
public static void main(String[]args){
    Single_tasK_single_thread t1=new Single_tasK_single_thread();
    t1.start();
}
    
}
