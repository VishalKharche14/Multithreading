package AdderSubtractorLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private AdderSubtractorLock.Count count;
    private Lock lock;

    public Adder(AdderSubtractorLock.Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=1; i<1001; i++){
            lock.lock();
            count.addValue(i);
            lock.unlock();
        }
    }
}
