package project_001;

public class People {
    private static int age=1;
    public People(){
        age++;
    }
    public static void  main(String args[]){
        People people1=new People();
        People people2=new People();
        System.out.println("peopel1 age is :"+People.age);
        System.out.println("peopel2 age is :"+People.age);
    }
}
