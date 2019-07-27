package project_001;

import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
    public static void main(String args[]){
        List list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        int  a;
        a=Integer.parseInt(list1.get(1).toString());
        System.out.println(a);
        System.out.println(list1.get(1).getClass());
        for (Object elem: list1){
            System.out.println(elem);
        }

    }
}
