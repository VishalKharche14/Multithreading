package HelloWorld;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread t = new Thread(printer);
        t.start();
        System.out.println("Hello from Main");
    }
}
