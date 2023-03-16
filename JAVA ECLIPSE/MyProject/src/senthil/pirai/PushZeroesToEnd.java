package senthil.pirai;

import java.util.Scanner;

public class PushZeroesToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int j = 0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			int s=0;
			for(int k=0;k<n;k++) {
				if(a[k]!=0) {
					a[s]=a[k];
					s++;
				}
			}
			s+=1;
			while(s<n) {
				a[s]=0;
				s++;
			}
			for(int m=0;m<n;m++) {
				System.out.print(a[m]+" ");
			}
			
			
		}
		sc.close();
	}

}
