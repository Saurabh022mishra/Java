public class DeadlockExample {
    
   
        private static Object lock1 = new Object();
        private static Object lock2 = new Object();
    
        public static void main(String[] args) {
            Thread thread1 = new Thread(() -> {
                synchronized (lock1) {
                    System.out.println("Thread 1 acquired lock1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 1 waiting for lock2");
                    synchronized (lock2) {
                        System.out.println("Thread 1 acquired lock2");
                    }
                }
            });
    
            Thread thread2 = new Thread(() -> {
                synchronized (lock2) {
                    System.out.println("Thread 2 acquired lock2");
                    System.out.println("Thread 2 waiting for lock1");
                    synchronized (lock1) {
                        System.out.println("Thread 2 acquired lock1");
                    }
                }
            });
    
            thread1.start();
            thread2.start();
        }
    
}
