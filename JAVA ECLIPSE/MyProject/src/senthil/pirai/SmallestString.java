package senthil.pirai;
import java.util.*;
class ClassA{
	char findMin(String temps) {
		char min = 'z';
		int l1=temps.length();
		for(int y=0;y<l1;y++) {
			if(temps.charAt(y)<min)
				min=temps.charAt(y);
		}
		return min;
	}
	void deleteChar(StringBuilder sb,int l,char min) {
		for(int z=0;z<l;z++) {
			if(sb.charAt(z)==min) {
				sb.deleteCharAt(z);
				break;
			}
		}
	}
}
public class SmallestString {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Enter the integer:");
		int k = sc.nextInt();
		String x = "";
		int l = sb.length();
		ClassA ca = new ClassA();
		for(int i=0;i<l;i++) {
			if(sb.length()<k) {
				String temps = sb.substring(0);
//				char min = 'z';
//				int l1=temps.length();
//				for(int y=0;y<l1;y++) {
//					if(temps.charAt(y)<min)
//						min=temps.charAt(y);
//				}
				char min = ca.findMin(temps);
				x = x+min;
//				for(int z=0;z<l;z++) {
//					if(sb.charAt(z)==min) {
//						sb.deleteCharAt(z);
//						break;
//					}
//				}
				ca.deleteChar(sb,l,min);
			}
			else {
				String temps = sb.substring(0,k);
//				char min = 'z';
//				for(int y=0;y<k;y++) {
//					if(temps.charAt(y)<min)
//						min=temps.charAt(y);
//				}
				char min = ca.findMin(temps);
				x = x+min;
//				for(int z=0;z<l;z++) {
//					if(sb.charAt(z)==min) {
//						sb.deleteCharAt(z);
//						break;
//					}
//				}
				ca.deleteChar(sb,l,min);
			}
			
		}
		System.out.println(x);
	sc.close();	
	}

}
