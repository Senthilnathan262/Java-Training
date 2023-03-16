package senthil.pirai;
import java.util.*;
public class CountOfSmallerNumbersAfterSelf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr.add(temp);
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(int x=0;x<arr.size();x++) {
			int count = 0;
			for (int j = x+1; j < arr.size(); j++) {
				if(arr.get(x)>arr.get(j)) {
					count++;
				}
			}
			ans.add(count);
		}
		System.out.println(ans);
	}

}
