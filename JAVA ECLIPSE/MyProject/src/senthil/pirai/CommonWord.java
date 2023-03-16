package senthil.pirai;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonWord {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the paragraph:");
		String str = sc.nextLine();
		System.out.println("Enter the no.of banned words:");
		int n = sc.nextInt();
		System.out.println("Enter the banned words:");
		ArrayList<String> b = new ArrayList();
		for(int i=0;i<n;i++) {
			b.add(sc.next());
		}
		
		str = str.toLowerCase();
		StringTokenizer st = new StringTokenizer(str," ");
		ArrayList<String> a = new ArrayList();
		while(st.hasMoreTokens()) {
			a.add(st.nextToken());
		}
		Stream s = a.stream();
		Function<String,String> f = temp->{
			if(b.contains(temp))
				return "$$$$";
			else
				return temp;
		};
		List<String> ans = a.stream().map(f).collect(Collectors.toList());
		for (int j = 0; j < ans.size(); j++) {
			if(ans.get(j).equals("$$$$")) {
				ans.remove(j);
			}
			
		}
		int max = 0;
		String answer = "";
		int len = ans.size();
		int check = 1;
		for(String temps:ans) {
			int count = 0;
			check++;
			for(String tempss:ans) {
				if(temps.equals(tempss))
					count++;
				
			}
			if(count>max) {
				max=count;
				answer=temps;
			}

		}
		System.out.println("Answer = "+answer);
	}

}
