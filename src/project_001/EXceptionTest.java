package project_001;

public class EXceptionTest {
    public void display(int i) throws MyException{
        if (i == 0 ){
            throw new MyException("该值不可为0");
        }
        else {
            System.out.println(i/2);
        }
    }
    public static void main (String args[]){
        EXceptionTest test = new EXceptionTest();
        try {
            test.display(0);
            System.out.println("-------");
        }
        catch (MyException e){
            e.printStackTrace();
        }
    }
}
