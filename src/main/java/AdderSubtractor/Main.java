package AdderSubtractor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AdderSubtractor.Count count = new AdderSubtractor.Count();

        AdderSubtractor.Adder adder = new AdderSubtractor.Adder(count);
        AdderSubtractor.Subtractor subtractor = new AdderSubtractor.Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
