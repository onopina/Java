package multithreading.multithreading_2_5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Способ 2 (AtomicInteger)
 */
public class Main2 {
    private static AtomicInteger num = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread thread1 = new Thread(Main2::incrementNum);
        Thread thread2 = new Thread(Main2::incrementNum);
        Thread thread3 = new Thread(Main2::incrementNum);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(num);
    }

    private synchronized static void incrementNum(){
        for (int i = 0; i < 100000; i++) {
            num.incrementAndGet();
        }
    }
}
