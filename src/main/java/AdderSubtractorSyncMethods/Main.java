package AdderSubtractorSyncMethods;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AdderSubtractorSyncMethods.Count count = new AdderSubtractorSyncMethods.Count();

        AdderSubtractorSyncMethods.Adder adder = new AdderSubtractorSyncMethods.Adder(count);
        AdderSubtractorSyncMethods.Subtractor subtractor = new AdderSubtractorSyncMethods.Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
