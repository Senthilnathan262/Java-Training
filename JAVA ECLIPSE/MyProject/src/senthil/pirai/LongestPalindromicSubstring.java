package senthil.pirai;

import java.util.*;
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] ch = s.toCharArray();
		Map m = new HashMap();
		int l=0;
		while(l<ch.length) {
			for(int i=l;i<ch.length;i++) {
				ArrayList a = new ArrayList();
				for(int j=l;j<=i;j++) {
					String temps = String.valueOf(ch[j]);
					a.add(temps);
					
				}
				m.put(a,1);
			}
			l++;
		}
		int max = 0;
		String ans = "";
		Set tempSet = m.entrySet();
		Iterator itr = tempSet.iterator();
		while(itr.hasNext()) {
			Map.Entry tempEntry = (Map.Entry)itr.next();
			ArrayList x = (ArrayList)tempEntry.getKey();
			ArrayList y = new ArrayList();
			for(int z=x.size()-1;z>=0;z--) {
				y.add(x.get(z));
			}
			if(x.equals(y)) {
				int length = x.size();
				if(length>max) {
					max=length;
					ans="";
					for(int c=0;c<x.size();c++) {
						ans=ans+x.get(c);
					}
				}
			}
		}
		System.out.println(ans);
			
	}

}
