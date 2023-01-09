package my.zhamri.bankAccount;

import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicBankAccount {
    private AtomicInteger money = new AtomicInteger(1000);

    public void withdraw() {
        for (int i = 0; i < 100000; i++) {
            this.money.addAndGet(-50);
        }
        System.out.println("Done withdraw");
    }

    public void deposit() {
        for (int i = 0; i < 100000; i++) {
            this.money.addAndGet(50);
        }
        System.out.println("Done deposit");
    }

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        AtomicBankAccount zhamri = new AtomicBankAccount();
        new Thread(zhamri::withdraw).start();
        new Thread(zhamri::deposit).start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Balance: " + zhamri.money);
        stopWatch.stop();
        System.out.println("Execution Time: " + stopWatch.getTime());
    }
}
