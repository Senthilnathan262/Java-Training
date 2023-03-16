package senthil.pirai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
//		for(int i=1;i<=10;i++)
//			a1.add(i);
		a1.add("senthil");
		a1.add("sarath");
		a1.add("sasi");
		a1.add("sabarees");
		System.out.println(a1);
		
		List<String> a2 = a1.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(a2);
		Long c = a1.stream().filter(n->n.length()==7).count();
		System.out.println(c);
		List<String> a3 = a1.stream().sorted().collect(Collectors.toList());
		System.out.println(a3);
		List<String> a4 = a1.stream().sorted((s1,s2)-> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(a4);
	}

}
