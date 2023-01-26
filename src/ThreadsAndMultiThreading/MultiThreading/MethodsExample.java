package ThreadsAndMultiThreading.MultiThreading;

public class MethodsExample extends Thread {
    public static void Amain(String[] args) {
        MethodsExample m = new MethodsExample();
        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getPriority());
        m.setName("main-1");
        System.out.println(m.getName());
        System.out.println(m.isAlive());
        System.out.println(m.getState());
        m.start();
        System.out.println(m.getState());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(m.getState());


    }
}
