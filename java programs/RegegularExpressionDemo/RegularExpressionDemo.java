import java.util.*;
import java.util.regex.*;
class RegularExpressionDemo{
    public static void main(String []args){
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target:");
        String target = sc.next();
        System.out.println("Enter the regular expression:");
        String regex = sc.next();
        Pattern p = Pattern.compile(target);
        Matcher m = p.matcher(regex);
        while(m.find()){
            count++;
            System.out.println(m.start()+"----"+m.end()+"----"+m.group());
        }
        System.out.println("The no.of occurences:"+count);

    }
}
