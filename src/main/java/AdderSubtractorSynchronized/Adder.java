package AdderSubtractorSynchronized;

public class Adder implements Runnable{
    private AdderSubtractorSynchronized.Count count;

    public Adder(AdderSubtractorSynchronized.Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1; i<1001; i++){
            synchronized (count) {
                count.addValue(i);
            }
        }
    }
}
