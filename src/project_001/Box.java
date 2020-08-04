package project_001;

public class Box <T> {
    private T t;
    public void add (T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public static void main(String args[]){
        Box<Integer> integerBox = new Box<Integer>();
        Box<Double> doubleBox = new Box<Double>();
        Box<String> stringBox = new Box<String>();
        integerBox.add(10);
        doubleBox.add(10.0);
        stringBox.add("123");
        stringBox.add(new String("12345"));
        System.out.printf("int value : %d\n\n",integerBox.get());
        System.out.printf("double value :%f\n\n",doubleBox.get());
        System.out.printf("str value :%s\n\n",stringBox.get());

    }

}
