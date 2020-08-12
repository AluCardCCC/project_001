package project_001;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo {
    public String regex = "\\bcat\\b";
    public String input  = "cat cat cat new cat";
    public static void main (String args[]){
        RegexDemo regexdemo = new RegexDemo();
        Pattern p = Pattern.compile(regexdemo.regex);
        Matcher m = p.matcher(regexdemo.input);
        int count = 0;
        while (m.find())
        {
            count++;
            System.out.println(count);
            System.out.println(m.start());
            System.out.println(m.end());
        }
//        System.out.println(m.end(1));
    }

}
