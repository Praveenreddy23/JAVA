package ThreadsAndMultiThreading.MultiThreading;

public class MyThread extends Thread{

    public void run(){

        for (int i = 10; i >0; i--) {
            System.out.println("Thread #1 :"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #1 is finished");

    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("Thread #2 :"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished");
    }
}
class MainMethod{
    public static void main(String[] args) {
        //create a subclass of thread
        MyThread  thread = new MyThread();

        //implements runnable interface and pass instance as an argument to thread constructor
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);

       // thread.setDaemon(true);
        //thread1.setDaemon(true);

        thread.start();
       /** try {
            thread.join(2000);//calling thread (ex main) wait until the specified thread dies or for x milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        thread1.start();
       //System.out.println(1/0);

    }
}
