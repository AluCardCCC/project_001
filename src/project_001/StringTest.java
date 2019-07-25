package project_001;

public class StringTest {
    public static void main(String args[]){
        String a = "aaa";
        String b = "bbb";
        String c = "aaa";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
    }
}
