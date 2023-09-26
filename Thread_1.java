public class Thread_1 extends Thread {
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            
            try{
           Thread.sleep(10000);
            }catch(Exception e){
                
            }
            //System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            
        }
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread_1 t1 = new Thread_1();
        Thread_1 t2 = new Thread_1();
        t1.start();
        t2.start();
        System.out.println(Thread.activeCount());
        t1.setName("Saurabh");
        t2.setName("Saurabh2");
        System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
t2.setPriority(2);
System.out.println(t2.getPriority());
    
    }
    
}
