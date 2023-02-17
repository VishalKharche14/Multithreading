package ProducerConsumer;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Consumer consumer1 = new Consumer(shop);
        Consumer consumer2 = new Consumer(shop);
        Producer producer1 = new Producer(shop);
        Producer producer2 = new Producer(shop);
        Producer producer3 = new Producer(shop);

        Thread t1 = new Thread(consumer1);
        Thread t2 = new Thread(consumer2);
        Thread t3 = new Thread(producer1);
        Thread t4 = new Thread(producer2);
        Thread t5 = new Thread(producer3);
        Thread t7 = new Thread(new Consumer(shop));
        Thread t8 = new Thread(new Consumer(shop));
        Thread t9 = new Thread(new Consumer(shop));
        Thread t10 = new Thread(new Consumer(shop));
        Thread t11= new Thread(new Consumer(shop));
        Thread t12 = new Thread(new Consumer(shop));
        Thread t13 = new Thread(new Consumer(shop));



        t1.start(); t2.start();t3.start(); t4.start(); t5.start();
        t7.start(); t8.start();t9.start(); t10.start(); t11.start();t13.start();t13.start();

    }
}
