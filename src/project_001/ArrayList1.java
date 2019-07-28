package project_001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String args[]){
        Double a=0.0;
        Double b=0.0;
        Double c=0.0;
        List list1 = new ArrayList();
        Long time1 = System.currentTimeMillis();
        for (int i=0;i<10000000;i++){
            list1.add(i);
        }
        Long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        Long time3 = System.currentTimeMillis();
        Iterator<Integer> iter = list1.iterator();
        while (iter.hasNext()){
            a+=iter.next();
        }
        Long time4 = System.currentTimeMillis();
        System.out.println(time4-time3);
        System.out.println(a);
        for (int i=0;i<list1.size();i++){
            String ii =list1.get(i).toString();
            b+= Integer.parseInt(ii);
        }

    }
}
