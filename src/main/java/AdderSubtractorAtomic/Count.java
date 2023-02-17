package AdderSubtractorAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {
    AtomicInteger value = new AtomicInteger(0);
    public void addValue(int i){
        this.value.addAndGet(i);
    }
}
