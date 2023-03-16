package senthil.pirai;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer s = new StringBuffer("Hello");
		s.append(",");
		System.out.println(s);
		s.append("morning");
		s.insert(6,"Good ");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.reverse();
		s.delete(0, 6);
		System.out.println(s);
		try {
			s.appendCodePoint(65);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			s.offsetByCodePoints(3,65);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			
			System.out.println(s.subSequence(7, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
