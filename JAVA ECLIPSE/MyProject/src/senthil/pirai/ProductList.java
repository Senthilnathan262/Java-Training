package senthil.pirai;

import java.util.*;


public class ProductList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str,",");
		ArrayList<Integer> arr = new ArrayList<>();
		while(st.hasMoreTokens()) {
			
				String temps = String.valueOf(st.nextToken());
				arr.add(Integer.parseInt(temps));
			
		}
		System.out.println(arr);
		ArrayList<Integer> ans = new ArrayList<>();
		for (int j = 0; j < arr.size(); j++) {
			int product = 1;
			for (int k = 0; k < arr.size(); k++) {
				if(j==k)
					continue;
				else {
					product *=arr.get(k);
				}
			}
			ans.add(product);
		}
		System.out.println(ans);
	}

}
