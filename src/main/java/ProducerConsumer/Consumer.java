package ProducerConsumer;

public class Consumer implements Runnable{
    private Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true){

            if(shop.size > 0){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                shop.size -= 1;
                System.out.println("Buying Clothes, Now Shop has "+ shop.size + " clothes");
            }
        }
    }
}
