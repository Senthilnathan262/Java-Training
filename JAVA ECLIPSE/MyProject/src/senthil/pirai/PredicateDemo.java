package senthil.pirai;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		Predicate<String> p = temp->(temp.length()==5);
//		boolean res = p.test(s);
//		System.out.println("Result = "+res);
		int[] x = new int[] {0,2,34,4,55,6,30,35,22,1}; 
		Predicate<Integer> p1 = temp->(temp>10);
		Predicate<Integer> p2 = temp->(temp%2==0);
		System.out.println("Numbers greater than 10:");
		m1(p1,x);
		System.out.println("Even numbers :");
		m1(p2,x);
		System.out.println("The numbers not greater than 10:");
		m1(p1.negate(),x);
		System.out.println("Odd numbers:");
		m1(p2.negate(),x);
		System.out.println("The numbers greater than 10 and even:");
		m1(p1.and(p2),x);
		System.out.println("The numbers greater than 10 or even:");
		m1(p1.or(p2),x);
		System.out.println("The numbers not greater than 10 or odd:");
		m1(p1.negate().and(p2.negate()),x);
		
	}
	public static void m1(Predicate<Integer> p,int[] x) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.print(x1+" ");
				
			}
		}
		System.out.println();
	}

}
