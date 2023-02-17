package AdderSubtractorSynchronized;

public class Subtractor implements Runnable {
    private AdderSubtractorSynchronized.Count count;

    public Subtractor(AdderSubtractorSynchronized.Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1; i<1001; i++){
            synchronized (count) {
                count.addValue(-i);
            }
        }
    }
}
