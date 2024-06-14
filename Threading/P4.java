class MyThread extends Thread{
public void run(){
    for (int i=1; i<=30;i++){
    System.out.printf("%d,%s\n",i,Thread.currentThread().getName());
}
}

}
public class P4 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("Thread t1");
        t2.setName("Thread t2");
        t1.start();
        t2.start();
    }
}
