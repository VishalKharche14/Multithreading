package AdderSubtractor;

public class Subtractor implements Runnable {
    private AdderSubtractor.Count count;

    public Subtractor(AdderSubtractor.Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1; i<1001; i++){
            count.addValue(-i);
        }
    }
}
