package senthil.pirai;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortArrayByParity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		List<Integer> l1 = a.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> l2 = a.stream().filter(i->i%2!=0).collect(Collectors.toList());
		l1.addAll(l2);
		System.out.println(l1);
//		Function<Integer,Integer> f1 = i->{
//			if(i%2==0)
//				return i;
//			return 0;
//		};
//		Function<Integer,Integer> f2 = i->{
//			if(i%2!=0)
//				return i;
//			return 0;
//		};
//		List<Integer> ans1 = a.stream().map(f1).collect(Collectors.toList());
//		List<Integer> ans2 = a.stream().map(f2).collect(Collectors.toList());
//		ArrayList answer = new ArrayList() ;
//		for(int i=0;i<ans1.size();i++) {
//			if(ans1.get(i)==0)
//				ans1.set(i, 999);
//		}
//		for(int i=0;i<ans2.size();i++) {
//			if(ans2.get(i)==0)
//				ans2.set(i, 999);
//		}
//		for(int i=0;i<ans1.size();i++) {
//			if(ans1.get(i)!=999)
//				answer.add(ans1.get(i));
//		}
//		for(int i=0;i<ans2.size();i++) {
//			if(ans2.get(i)!=999)
//				answer.add(ans2.get(i));
//		}
//		if(answer.isEmpty()) {
//			answer.add(0);
//			System.out.println(answer);
//		}
//		else
//			System.out.println(answer);
		
	}

}
