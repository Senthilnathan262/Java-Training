package senthil.pirai;

import java.util.*;

public class ReverseQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			q.add(sc.nextInt());
		}
		Stack<Integer> s = new Stack<>();
		for(int j=0;j<k;j++) {
			int temp = q.poll();
			s.push(temp);
			
		}
		for(int l=0;l<k;l++) {
			System.out.print(s.pop()+" ");
		}
		for(int m=0;m<n-k;m++) {
			System.out.print(q.poll()+" ");
		}
		
		sc.close();

	}

}
