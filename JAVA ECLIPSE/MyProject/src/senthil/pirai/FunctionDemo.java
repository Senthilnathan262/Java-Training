package senthil.pirai;

import java.util.function.Function;
//1. this could be an inner class as well.
class Test{
	public void m1() {
		System.out.println("from m1");
	}
}

public class FunctionDemo {
//2.	public static void m1() {
//			System.out.println("from m1");
//		}
	public static void main(String[] args) {

//		Function<String,Integer> f = s->s.length();
//		System.out.println(f.apply(""));
		Test t = new Test();
		Runnable r = t::m1;
		Thread t1 = new Thread(r);
		t1.start();
		System.out.println("Main thread");
	}

}
