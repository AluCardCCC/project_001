package project_001.SyncThreadTask;


public class Bank {
    private int count=0;
    public void addMoney(int money){
        count+=money;
        System.out.println(System.currentTimeMillis()+"add money"+money);
    }
    public void takeMoney(int money){
        if (count-money<=0){
            System.out.println("not engthn");
            return;
        }
        else {
            count-=money;
            System.out.println(System.currentTimeMillis()+"take"+money);
        }
    }
    public void loadMoney(){
        System.out.println("money is "+count);
    }


}
