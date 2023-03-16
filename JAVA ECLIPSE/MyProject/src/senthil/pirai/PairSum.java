package senthil.pirai;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of test cases:");
		int t = sc.nextInt();
		for(int a=0;a<t;a++) {
			while(true) {
				if(t<=0||t>100) {
					System.out.println("Please enter a number from 1 to 100");
					continue;
				}
				else {
					while(true) {
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
							System.out.println("Enter the sum value:");
							int s = sc.nextInt();
							while(true) {
								if(s<0||s>1000000000) {
									System.out.println("Please enter a value from 0 to 1000000000");
									continue;
								}
								else {
									int count=0;
									for(int x=0;x<n;x++) {
										for(int y=x+1;y<n;y++) {
											if((arr[x]+arr[y])==s) {
												count++;
											}
										}
										
									}
									System.out.println(count);
									break;
								}
							}
							
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
