package project_001.SyncThreadTask;

import java.util.TreeMap;

public class SyncThreadTest {
    public static void main(String args[]){
        final Bank bank = new Bank();
        Thread tadd = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    bank.addMoney(100);
                    bank.loadMoney();
                    System.out.println("\n");
                }
            }
        });
        Thread ttake = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    bank.addMoney(100);
                    bank.loadMoney();
                    System.out.println("\n");
                    try {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        tadd.start();
        ttake.start();
    }
}
