package project_001;

import java.util.*;

public class HashTableTest {
    public static void main(String args[]){
        testHashMapAPIs();
    }
    private static void testHashMapAPIs(){
        Random r = new Random();
        HashMap hashmap = new HashMap();
        hashmap.put("a",r.nextInt());
        hashmap.put("b",r.nextInt());
        System.out.println("new hash map is "+hashmap);
        Iterator iter = hashmap.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println("next key is "+ entry.getKey() + " and value is"+entry.getValue());

        }
        System.out.println("map size is"+hashmap.size());
        Set newset = hashmap.keySet();
        System.out.println("hash map key set is"+ newset + " and type is "+newset.getClass());
        hashmap.remove("2");
        System.out.println("after remove,size is"+hashmap.size()+" key set is "+hashmap.keySet());
        HashMap hashmap2 = (HashMap) hashmap.clone();
        hashmap.clear();
        System.out.println("hashmap1 is "+hashmap+"hashmap2 is "+hashmap2);
        System.out.println((hashmap.isEmpty()?"yes":"no"));
    }
}
