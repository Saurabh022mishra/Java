public class Single_task_Multiple_thread_modal extends Thread {
    public void run() {
        System.out.println("Task One>>>>");

    }

    public static void main(String[] args) {
        Single_task_Multiple_thread_modal t1 = new Single_task_Multiple_thread_modal();
        Single_task_Multiple_thread_modal t2 = new Single_task_Multiple_thread_modal();
        Single_task_Multiple_thread_modal t3 = new Single_task_Multiple_thread_modal();
        t1.start();
        t2.start();
        t3.start();
    }
}
