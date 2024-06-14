class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class P1{
public static void main(String[] args){

MyThread t1 = new MyThread();
MyThread t2 = new MyThread();
t2.setPriority(6);
t1.setName("Thread t1");
t2.setName("Thread t2");
System.out.println("Starting threads...");
t1.start();
t2.start();


}


}