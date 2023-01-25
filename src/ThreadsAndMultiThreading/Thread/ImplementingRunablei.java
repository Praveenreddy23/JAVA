package ThreadsAndMultiThreading.Thread;
//By Implementing Runnable interface:
public class ImplementingRunablei implements Runnable {
    @Override
    public void run(){
        //Define of thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
class ImplementsRun{
    public static void main(String[] args) {
        //Start execution
        ImplementingRunablei i = new ImplementingRunablei();

        Thread t = new Thread(i);
        t.start();

        for (int j = 0; j < 5; j++) {
            System.out.println("Main Thread");
        }
    }
}
