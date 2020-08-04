package project_001;

public class ThreadTest extends Thread {
    public void run(){
        System.out.println("run");
    }
    public static void main (String args[]){
        Thread test = new ThreadTest();
        test.start();
    }
}
