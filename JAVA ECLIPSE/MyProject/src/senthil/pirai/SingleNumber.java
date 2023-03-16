package senthil.pirai;
import java.util.*;
public class SingleNumber {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str,",");
		String s = "";
		while(st.hasMoreTokens()) {
			s=s+st.nextToken();
		}
		Map m = new HashMap();
		char[] ch = s.toCharArray();
		int count = 0;
		for(int i=0;i<ch.length;i++) {
			count=1;
			if(i==0) {
				m.put(ch[i], count);
			}
			else {
				for(int j=0;j<i;j++) {
					if(ch[j]==ch[i]) {
						count++;
						m.put(ch[i], count);
						m.put(ch[j], count);
					}
					else {
						m.put(ch[i], count);
					}
				}
			}
		}
//		System.out.println(a);
//		for(int j=0;j<a.size();j++) {
//			if(j==0) {
//				m.put(a.get(j), 1);
//			}
//			else {
//				Set s = m.keySet();
//				Iterator itr = s.iterator();
//				while(itr.hasNext()) {
////					Set s2 = m.keySet();
////					System.out.println(s2);
////					Iterator itr2 = s2.iterator();
////					while(itr2.hasNext()) {
//					int tempk=(int)itr.next();
//						if(a.get(j)==tempk) {
//							//tempEntry.setValue((int)tempEntry.getValue()+1);
//							m.put(a.get(j), 2);
//							continue;
//							
//						}
//					
//						else
//							m.put(a.get(j), 1);
////					}
//				}
//			}
//		}
		System.out.println(m);
		Set s1 = m.entrySet();
		Iterator itr1 = s1.iterator();
		while(itr1.hasNext()) {
			Map.Entry tempEntry1=(Map.Entry)itr1.next();
			if((int)tempEntry1.getValue()==1) {
				System.out.println(tempEntry1.getKey());
			}
		}
		
	}

}
