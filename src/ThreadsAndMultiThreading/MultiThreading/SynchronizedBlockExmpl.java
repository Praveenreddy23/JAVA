package ThreadsAndMultiThreading.MultiThreading;

public class SynchronizedBlockExmpl {
    public void printNumberAsc() //Synchronized
    {
        for (int i = 1; i < 5; i++)
        {
            System.out.println(i);
        }
    }
    public void printNumberDec() //Synchronized
    {
        for (int i = 5; i >=0 ; i--) {
            System.out.println(i);
        }
    }
}
class ThreadOne extends Thread{
    SynchronizedBlockExmpl sb;

    public ThreadOne(SynchronizedBlockExmpl sb) {
        this.sb = sb;
    }
    @Override
    public void run(){
//        synchronized block making object as thread safe
        synchronized(sb){
            sb.printNumberAsc();
        }
    }
}
class ThreadTwo extends Thread{
    SynchronizedBlockExmpl sb;

    public ThreadTwo(SynchronizedBlockExmpl sb) {
        this.sb = sb;
    }
    @Override
    public void run(){
        synchronized(sb){
            sb.printNumberDec();
        }
    }
}
class Main{
    public static void main(String[] args) {
        SynchronizedBlockExmpl sb = new SynchronizedBlockExmpl();

        ThreadOne one = new ThreadOne(sb);
        ThreadTwo two = new ThreadTwo(sb);

        one.start();
        two.start();

    }
}
