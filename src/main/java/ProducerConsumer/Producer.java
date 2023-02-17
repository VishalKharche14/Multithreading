package ProducerConsumer;

public class Producer implements Runnable{
    private Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(shop.size < 5){
                shop.size += 1;
                System.out.println("Adding Clothes, Now Shop has "+ shop.size + " clothes");
            }
        }

    }
}
