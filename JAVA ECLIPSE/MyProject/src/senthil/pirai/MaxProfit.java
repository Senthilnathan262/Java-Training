package senthil.pirai;
import java.util.*;
public class MaxProfit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			int profit = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]>=a[i]) {
					profit+=a[i];
				}
			}
			if(profit>max) {
				max=profit;
			}
		}
		System.out.println(max);

	}

}
