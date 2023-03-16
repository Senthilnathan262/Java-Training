package senthil.pirai;
import java.util.*;
public class ZigzagConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		ArrayList ans = new ArrayList();
		char[] ch = str.toCharArray();
		int count=n;
		for(int i=0;i<n;i++) {
			ArrayList<String> temp = new ArrayList();
			ans.add(temp);
		}
		int k=0;
		int j=0;
		int check=0;
		int check1=0;
		while(true) {
			while(j<ch.length) {
				String temps = String.valueOf(ch[j]);
				ArrayList temparr = (ArrayList)ans.get(k);
				temparr.add(temps);
				ans.set(k, temparr);
				j++;
				
				if(j==(ch.length)) {
					check=1;
				}
				break;
			}
			if(check1==0) {
				k++;
				if(k==n-1) {
					check1=1;
				}
				
			}
			else  {
				k--;
				if(k==0) {
					check1=0;
				}
			}
			if(check==1)
				break;
		}
		System.out.println(ans);
		String answer = "";
		for(int x=0;x<n;x++) {
			ArrayList tempa = (ArrayList)ans.get(x);
			for(int y=0;y<tempa.size();y++) {
				answer+=tempa.get(y);
			}
		}
		System.out.println(answer);
	}

}
