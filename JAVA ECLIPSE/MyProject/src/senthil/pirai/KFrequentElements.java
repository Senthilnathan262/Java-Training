package senthil.pirai;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KFrequentElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		ArrayList<Integer> a = new ArrayList();
		for(int i=0;i<n;i++)
			a.add(sc.nextInt());
		System.out.println("Enter K value:");
		int k = sc.nextInt();
		Function<Integer,Integer> f = i->{
			int x = Collections.frequency(a, i);
			if(x>=k) {
				return i;
			}
			else
				return 0;
			
		};
		List<Integer> ans = a.stream().map(f).collect(Collectors.toList());
		int length = ans.size();
		for(int z=0;z<length;z++) {
			if(ans.get(z)==0)
				ans.set(z,999);
		}
		int max1 = 0;
		int max1num = 0;
		int max2 = 0;
		int max2num = 0;
		ArrayList answer = new ArrayList();
		for(Integer x:ans) {
			if(x==999)
				continue;
			int count = 0;
			for(int i=0;i<ans.size();i++) {
				if(x==ans.get(i)) {
					count++;
				}
			}
			if(count>max1) {
				max2=max1;
				max2num=max1num;
				max1=count;
				max1num=x;
				while(true) {
					if(!ans.contains(x))
						break;
					else {
						int index = ans.indexOf(x);
						ans.set(index, 999);
					}
				}
			}
			else if(count>max2) {
				max2=count;
				max2num=x;
				while(true) {
					if(!ans.contains(x))
						break;
					else {
						int index = ans.indexOf(x);
						ans.set(index, 999);
					}
				}
			}
			
			
		}
		answer.add(max1num);
		if(max2num!=0)
			answer.add(max2num);
		System.out.println(answer);
	}

}
