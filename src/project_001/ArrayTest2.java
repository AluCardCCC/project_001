package project_001;

import java.util.*;

public class ArrayTest2 {
    public static void main(String args[]){
        List list1 = new ArrayList();
        list1.add(1);
        int a [] = new int [] {1,2,3};
        int b [] = new int [] {1,2,3};
        System.out.println(a);
        list1.add(a);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.get(1));
        System.out.println(list1.contains(b));
    }
}
