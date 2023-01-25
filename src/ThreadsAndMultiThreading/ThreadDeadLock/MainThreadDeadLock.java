package ThreadsAndMultiThreading.ThreadDeadLock;

public class MainThreadDeadLock {
    public static void main(String[] args) {
        String str = new String("Hello");
        String str1 = new String("Bye");

        ThreadOne t1 = new ThreadOne(str,str1);
        ThreadTwo t2 = new ThreadTwo(str,str1);
        t1.start();
        t2.start();


    }
}
class ThreadOne extends Thread {
    String s = null;
    String s1 = null;

    public ThreadOne(String s, String s1) {
        this.s = s;
        this.s1 = s1;
    }
    @Override
    public void run(){
        System.out.println("t1 waiting to lock s1");
        synchronized (s){
            System.out.println("t1 lock s1");
            System.out.println("t1 waiting to lock s2");
            try {
                System.out.println("Pause the execution");
                s.wait();
                System.out.println("resume the execution");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (s1){
                System.out.println("t1 lock s2");
            }
            System.out.println("t1 unlock s1");
            System.out.println("t1 unlock s2");
        }
    }
}

class ThreadTwo extends Thread{
    String s2 = null;
    String s3 = null;

    public ThreadTwo(String s2, String s3) {
        this.s2 = s2;
        this.s3 = s3;
    }
    @Override
    public void run(){
        System.out.println("t2 waiting to lock s2 ");
        synchronized (s2){
            System.out.println("t2 lock s2");
            System.out.println("t2 waiting to lock s2");
            synchronized (s3){
                System.out.println("t2 lock s3");
                s2.notify();
            }
            System.out.println("t2 unlock s2");
            System.out.println("t2 unlock s3");
        }
    }
}

