package ProducerConsumer;

public class Consumer implements Runnable{
    private Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(shop.size > 0){
                shop.size -= 1;
                System.out.println("Buying Clothes, Now Shop has "+ shop.size + " clothes");
            }
        }
    }
}
