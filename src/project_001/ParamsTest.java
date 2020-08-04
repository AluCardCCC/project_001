package project_001;

public class ParamsTest {
    public void pass(int i){
        i = 10;
        System.out.println("value in pass"+i);
    }
    public static void main (String args []){
        ParamsTest aaa = new ParamsTest();
        int i =20;
        aaa.pass(i);
        System.out.println("value in main"+i);
    }
}
