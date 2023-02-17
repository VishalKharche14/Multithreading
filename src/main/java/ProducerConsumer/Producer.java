package ProducerConsumer;

public class Producer implements Runnable{
    private Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true){
            if(shop.size < 5){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                shop.size += 1;
                System.out.println("Adding Clothes, Now Shop has "+ shop.size + " clothes");
            }
        }

    }
}
