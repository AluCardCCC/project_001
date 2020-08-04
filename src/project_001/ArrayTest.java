package project_001;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String args[]){
        Person person_01 = new Person("ci1");
        Person [] person1 = new Person[]{person_01};
        Person [] person2 = Arrays.copyOf(person1,person1.length);

        System.out.println("数组1");
        display(person1);
        System.out.println("数组2");
        display(person2);
        person2[0].setName("ccccc");
        System.out.println("改变值");
        display(person1);
        display(person2);


    }
    public static void display(Person [] persons){
        for (Person person: persons){
            System.out.println(person.toString());
        }
    }
}
