package senthil.pirai;

import java.util.Scanner;

public class PushZeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of test cases:");
		int t = sc.nextInt();
		for(int a=1;a<=t;a++) {
			while(true) {
				if(t<=0||t>100) {
					System.out.println("Please enter a number from 1 to 100");
					continue;
				}
				else {
					while(true) {
						System.out.println("Test case "+a+" :");
						System.out.println("Enter the size of the array/list:");
						int n = sc.nextInt();
						if(n<2||n>=100000) {
							System.out.println("Please enter a number from 2 to 100000");
							continue;
						}
						else {
							System.out.println("Enter the elements:");
							int[] arr = new int[n];
							for(int i = 0;i<n;i++) {
								int temp = sc.nextInt();
								arr[i]=temp;
							}
							for(int i=0;i<n;i++){
								if(arr[i]==0) {
									
									int next = i;
									if(next==n-1) {
										next=i;
									}
									else if((next+1)<=n-1) {
										next=i+1;
									}
									while(arr[next]==0) {
										if(next==n-1) {
											break;
										}
										next++;
									}
									int temp = arr[next];
									arr[next]=arr[i];
									arr[i]=temp;
								}
								
							}
							for(int m=0;m<n;m++) {
								System.out.print(arr[m]+" ");
							}
							System.out.println();
							break;
						}
					}
					break;
				}
			}
		}
	sc.close();	
	}
}
