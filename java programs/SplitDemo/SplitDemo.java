import java.util.regex.*;
import java.util.*;
class SplitDemo
{
	public static void main(String[] args) {
	    
        // Pattern p = Pattern.compile("\\.");
        // String[] s = p.split("www.google.com");
        // for(String s1:s){
        //     System.out.println(s1);
        //}
        
        
        
        // String s = "www.google.com";
        // String[] s1 = s.split("\\.");
        // for(String s2:s1){
        //     System.out.println(s2);
        // }
        
        int index=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s,".");
        while(st.hasMoreTokens()){
            index++;
            System.out.println(index+" "+st.nextToken());
        }
        
            
        
	}
}

