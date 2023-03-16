package senthil.pirai;
import java.util.*;
public class DivSubarrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str,",");
		String s = "";
		while(st.hasMoreTokens()) {
			s=s+st.nextToken();
		}
		Map m = new HashMap();
		char[] ch = s.toCharArray();
		int k = sc.nextInt();
		int p = sc.nextInt();
		int l=0;
		while(l<ch.length) {
			for(int i=l;i<ch.length;i++) {
				ArrayList a = new ArrayList();
				for(int j=l;j<=i;j++) {
					String temps = String.valueOf(ch[j]);
					a.add(Integer.valueOf(temps));
					
				}
				m.put(a, 1);
			}
			l++;
		}
		System.out.println(m);
		System.out.println(m.size());
		Set tempSet = m.entrySet();
		Iterator itr = tempSet.iterator();
		while(itr.hasNext()) {
			Map.Entry tempEntry = (Map.Entry)itr.next();
			ArrayList x = (ArrayList)tempEntry.getKey();
			Iterator it = x.iterator();
			int check=0;
			while(it.hasNext()) {
				int temp = (int)it.next();
				
				if(temp%p==0) {
					check++;
				}
				if(check>k) {
					m.put(x,2);
				}
			
			}
		}
		System.out.println(m);
		System.out.println(m.size());
		int ans = 0;
		Set s1 = m.entrySet();
		Iterator itr1 = s1.iterator();
		while(itr1.hasNext()) {
			Map.Entry tempEntry1=(Map.Entry)itr1.next();
			if((int)tempEntry1.getValue()==1) {
				ans++;
			}
		}
		System.out.println("ans ="+ans);

	}

}
