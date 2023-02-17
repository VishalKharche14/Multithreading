package AdderSubtractorSynchronized;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AdderSubtractorSynchronized.Count count = new AdderSubtractorSynchronized.Count();

        AdderSubtractorSynchronized.Adder adder = new AdderSubtractorSynchronized.Adder(count);
        AdderSubtractorSynchronized.Subtractor subtractor = new AdderSubtractorSynchronized.Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
