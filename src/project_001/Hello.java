package project_001;

public class Hello {

    private Hello(){
        System.out.println("start init this class");
    }
    protected void getter(){
        System.out.println("123");
    }
    public String pp(){
        System.out.println("123123141");
        return "12314141p";
    }

    public static void main (String args[]){
        String aa;
        Hello a =new Hello();
        a.getter();
        a.getClass();
        aa=a.pp();
        System.out.println(aa);
        int x,y;
        x=10;
        y=(x==10)?1:0;
        System.out.println("value x:"+ x);
        System.out.println("value y:" + y);


    }
}
