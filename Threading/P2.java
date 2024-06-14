class MyThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class P2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);
        t3.setName("Thread t1");
        t4.setName("Thread t2");
        t3.setPriority(3);
        t4.setPriority(10);
        t3.start();
        t4.start();
    }
}
