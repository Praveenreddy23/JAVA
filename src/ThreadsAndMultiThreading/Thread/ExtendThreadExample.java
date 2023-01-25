package ThreadsAndMultiThreading.Thread;
//By extending Thread Class:
public class ExtendThreadExample extends Thread {
   @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExtendThreadExample t = new ExtendThreadExample();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Reddy");
            Thread.sleep(2000);
        }
    }
}
