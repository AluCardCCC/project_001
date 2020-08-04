package project_001;

public class Person {
    protected String name;
    protected String sex;
    protected int age;
    protected String getName(){
        return name;
    }
    protected void setName(String name){
        this.name=name;
    }
    public String toString(){
        return "this name is "+ name;
    }
    Person(String name){
        System.out.println("this person name is "+name);

    }
    public void display(){
        System.out.println("name is"+name);
    }

}
