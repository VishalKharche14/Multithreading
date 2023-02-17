package AdderSubtractor;

public class Adder implements Runnable{
    private AdderSubtractor.Count count;

    public Adder(AdderSubtractor.Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1; i<1001; i++){
            count.addValue(i);
        }
    }
}
