package project_001;

public class MyThread extends Thread {
    private  int tickets = 5;
    public void run(){
        for (int i=0;i<20;i++){
            if (tickets > 0){
                System.out.println("tickets : " + tickets--);
                System.out.println("i value is :" +i);
            }
        }
    }

}

