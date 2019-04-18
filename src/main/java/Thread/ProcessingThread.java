package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingThread implements Runnable {
    private AtomicInteger count = new AtomicInteger();
    private String values ;
    ProcessingThread(String value) {
        values= value;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            System.out.println("Value" + values);
            if (Thread.interrupted()) {

                System.out.println("Thread Intreptted");
                break;
            }
            count.incrementAndGet();
        }
    }

    public int getCount() {
        return this.count.get();
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
