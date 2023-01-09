package my.zhamri;

import java.util.concurrent.TimeUnit;

public class SynchronizedBankAccount {
    private int money = 1000;

    public void withdraw() {
        for (int i = 0; i < 100000; i++) {
            synchronized (this) {
                this.money -= 50;
            }
        }
        System.out.println("Done withdraw");
    }

    public void deposit() {
        for (int i = 0; i < 100000; i++) {
            synchronized (this) {
                this.money += 50;
            }
        }
        System.out.println("Done deposit");
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedBankAccount zhamri = new SynchronizedBankAccount();
        new Thread(zhamri::withdraw).start();
        new Thread(zhamri::deposit).start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Balance: " + zhamri.money);
    }
}
