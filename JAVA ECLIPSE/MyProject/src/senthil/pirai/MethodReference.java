package senthil.pirai;
interface Iface1{
	void m1(int a);
}
public class MethodReference {
	public static void m2(int a) {
		System.out.println("From main"+a);
	}
	public static void main(String[] args) {
		Iface1 i = a -> System.out.println("from lambda"+a);
		int a = 10;
		MethodReference.m2(a);
//		Iface1 i1 = MethodReference::m2;
		i.m1(a);
	}

}
