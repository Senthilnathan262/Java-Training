package senthil.pirai;

public class StringBuilderDemo {
	public static void main(String []args) {
	StringBuilder s = new StringBuilder("Hello");
	try {
		s.append("Java");
		System.out.println(s);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("capacity ="+s.capacity());
	s.ensureCapacity(50);
	System.out.println("capacity ="+s.capacity());
	char[] str = new char[] {'a','b'} ;
	
	try {
		s.getChars(0,1,str,0);
		System.out.println(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	try {
		s.insert(5, false);
		System.out.println(s);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		System.out.println(s.capacity());
		s.trimToSize();
		System.out.println(s.capacity());
	} catch (Exception e) {
		e.printStackTrace();
	}
	s.replace(5, 10, "true");
	System.out.println(s);
	
	StringBuffer buffer = new StringBuffer("PI-056");
	System.out.println(buffer.substring(buffer.lastIndexOf("-")+1));
	
	}
}
