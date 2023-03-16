package senthil.pirai;
import java.util.*;
public class IsomorphicStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		Map m1 = new HashMap();
		Map m2 = new HashMap();
		char[] ch1 = s.toCharArray();
		char[] ch2 = t.toCharArray();
		int count = 0;
		for(int i=0;i<ch1.length;i++) {
			count=1;
			if(i==0) {
				m1.put(i, count);
			}
			else {
				for(int j=0;j<i;j++) {
					if(ch1[j]==ch1[i]) {
						count++;
						m1.put(i, count);
						m1.put(j, count);
					}
					else {
						m1.put(i, count);
					}
				}
			}
		}
		System.out.println(m1);
		for(int i=0;i<ch2.length;i++) {
			count=1;
			if(i==0) {
				m2.put(i, count);
			}
			else {
				for(int j=0;j<i;j++) {
					if(ch2[j]==ch2[i]) {
						count++;
						m2.put(i, count);
						m2.put(j, count);
					}
					else {
						m2.put(i, count);
					}
				}
			}
		}
		System.out.println(m2);
		System.out.println(m1.equals(m2));
	}

}
