package project_001;

public class InnerClass {
    private static String name = "ci";
    private int age = 24;
    public static class MyInnerClass{
        private static String myName = "jiawei";
        private int myAge = 25;
        public void call (){
            System.out.println(name);
            ////System.out.println(age);
        }
    }
    public static void main (String args[]){
        MyInnerClass class1 = new MyInnerClass();
        class1.call();
    }
}
