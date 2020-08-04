package project_001;
class Vehicle{}
class Car extends Vehicle{}

public class NewInstanceTest {
    public static void main(String args []){
        Vehicle a =new Car();
        Car b = new Car();
        Vehicle c = new Vehicle();
        boolean a_b = c instanceof Vehicle;
        System.out.println(a_b);
    }
}

