package senthil.pirai;
import java.util.*;
public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack st = new Stack();
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		int check=0;
		for (int j = 0; j < str.length(); j++) {
			char ch  = (char)st.pop();
			if(ch=='(') {
				count1++;
				if(count1>count2) {
					check=1;
					break;
				}
				
			}
			else if(ch=='{') {
				count3++;
				if(count3>count4) {
					check=1;
					break;
				}
			}				
			else if(ch=='[') {
				count5++;
				if(count5>count6) {
					check=1;
					break;
				}
			}
			else if(ch==')') {
				count2++;
				if(count1>count2) {
					check=1;
					break;
				}
				
			}
			else if(ch=='}') {
				count4++;
				if(count3>count4) {
					check=1;
					break;
				}
				
			}
			else {
				count6++;
				if(count5>count6) {
					check=1;
					break;
				}
				
			}
		}
		if(check==0) {
			if(count1==count2) {
				if(count3==count4) {
					if(count5==count6) {
						System.out.println("True");
					}
				}
			}
		}
		else
			System.out.println("False");
		sc.close();
	}
}
