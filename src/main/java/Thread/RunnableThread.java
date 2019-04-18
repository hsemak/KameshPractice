package Thread;

public class RunnableThread {
    public static void main(String[] args) throws InterruptedException {

        ProcessingThread pt = new ProcessingThread("Hello");
        Thread t1 = new Thread(pt);
        t1.start();
//        t1.run();
        Thread t2 = new Thread(pt);
        t2.start();
//        t1.interrupt();

        t1.join();
        System.out.println(t2.isAlive());
        t2.join();
        System.out.println(t2.isAlive());
        System.out.println("Processing count=" + pt.getCount());
    }
}
