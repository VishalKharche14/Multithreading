package AdderSubtractorLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AdderSubtractorLock.Count count = new AdderSubtractorLock.Count();
        Lock lock = new ReentrantLock();

        AdderSubtractorLock.Adder adder = new AdderSubtractorLock.Adder(count,lock);
        AdderSubtractorLock.Subtractor subtractor = new AdderSubtractorLock.Subtractor(count,lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
