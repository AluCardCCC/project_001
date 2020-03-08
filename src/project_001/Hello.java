package project_001;

import java.lang.reflect.Type;

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
    private static String GetType(Object o){
        return o.getClass().toString();
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
        System.out.println("char test\n ");
        Character ch = new Character('a');
        char ch2= 'b';
        System.out.println(ch);
        System.out.println(ch.getClass().getName());
        System.out.println(GetType(ch2));

        int aaa [] = {1,2,3,4};
        System.out.println(aaa);
        for(int i=0;i<aaa.length;i++)
            {System.out.println(aaa[i]);}
    }
}
