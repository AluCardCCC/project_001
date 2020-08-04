package project_001;

public class ThreadDemo {
    public static void main(String args[]){
        System.out.println("start mythread 1");
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

        System.out.println("\n\n");
        System.out.println("start mythread 2");
        MyThread2 my = new MyThread2();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();

    }
}
