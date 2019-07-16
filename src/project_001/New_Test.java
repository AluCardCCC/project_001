package project_001;

public class New_Test {
    private int a=2;
    private static int b=0;
    private static int add(){
        //return a++;
        return b++;
    }
    private int add2(){

        System.out.println(b);
        return a++;
    }
    public static void main (String  args []){
        int bb;
        int cc;
        New_Test aa = new New_Test();
        bb=aa.add();
        cc=aa.add2();
        System.out.println(bb);
        System.out.println(cc);
    }
}
