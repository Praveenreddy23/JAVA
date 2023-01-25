package ThreadsAndMultiThreading.Thread;

public class ThreadSchedule extends Thread {
    @Override
    public void run(){
        String  s = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ThreadSchedule t= new ThreadSchedule();
        ThreadSchedule t1= new ThreadSchedule();
        ThreadSchedule t2= new ThreadSchedule();

        t.setName("Thread 1");
        t1.setName("Thread 2");
        t2.setName("Thread 3");

        t.start();
        t1.start();
        t2.start();

        String  s = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }
    }
}
