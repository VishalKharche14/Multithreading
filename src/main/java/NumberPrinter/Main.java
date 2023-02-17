package NumberPrinter;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<101; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            System.out.println("starting thread "+i);
            t.start();
//            System.out.println(i+" from main");
        }
    }
}
