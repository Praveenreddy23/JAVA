package ThreadsAndMultiThreading.MultiThreading;

public class SynchronizedMethodExmpl {
/*
->Write a program to explain multithreading:
 */
    //task class
    synchronized public void printNumberAsc()
    {
        for (int i = 1; i < 5; i++)
        {
            System.out.println(i);
        }
    }
    synchronized public void printNumberDec()
        {
            for (int i = 5; i >=0 ; i--) {
                System.out.println(i);
            }
        }
}
class Main1 extends Thread{
    //Thread class
    SynchronizedMethodExmpl r ;
    public Main1(SynchronizedMethodExmpl r) {
        this.r=r;
    }
        @Override
        public void run(){
            r.printNumberAsc();
        }
}
class Main2 extends Thread{
    //Thread class
     SynchronizedMethodExmpl r;
    public Main2(SynchronizedMethodExmpl r) {
        this.r=r;
    }
    @Override
    public void run(){
        r.printNumberDec();
    }
}
class MainThread{
    public static void main(String[] args) {
        SynchronizedMethodExmpl r = new SynchronizedMethodExmpl();

        Main1 m1 = new Main1(r);
        Main2 m2 = new Main2(r);

        m1.start();
        m2.start();
    }
}


