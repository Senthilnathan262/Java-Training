package senthil.pirai;

import java.util.Scanner;

class Calc{
	void add(int a,int b) {
		int res = a+b;
		System.out.println("ans ="+res);
	}
	void add(int a,int b,int c) {
		int res = a+b+c;
		System.out.println("ans ="+res);
	}
}

interface CutOff{
	double calcCutOff(int s);
}
class Maths implements CutOff{
	public double calcCutOff(int s) {
		return s;
	}
}
class Physics implements CutOff{
	public double calcCutOff(int s) {
		return s/2;
	}
}
class Chemistry implements CutOff{
	public double calcCutOff(int s) {
		return s/2;
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Overloading demo..");
		Calc calc = new Calc();
		while(true) {
			System.err.println("1.Add 2 numbers\n2.Add 3 numbers\n3.Exit\nEnter the choice");
			int ch = sc.nextInt();
			
		
			if(ch==1) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				calc.add(x,y);
				continue;
			}
			else if(ch==2) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				calc.add(x,y,z);
				continue;
			}
			else if(ch==3)
				break;
			else {
				System.out.println("Please enter a valid choice");
				continue;
			}
		}
		System.out.println("Overriding demo..");
		System.out.println("Enter maths score");
		int m = sc.nextInt();
		System.out.println("Enter physics score");
		int p = sc.nextInt();
		System.out.println("Enter chemistry score");
		int c = sc.nextInt();
		CutOff cut = new Maths();
		double m1 = cut.calcCutOff(m);
		cut = new Physics();
		double p1 = cut.calcCutOff(p);
		cut = new Chemistry();
		double c1 = cut.calcCutOff(c);
		double res = m1+p1+c1;
		System.out.println("Your cut off is"+res);
		
		sc.close();
	}

}
