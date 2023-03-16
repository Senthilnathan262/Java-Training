import java.util.*;
class Palindrome{
	 public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter start value:");
		int start=s.nextInt();
		System.out.println("enter stop value:");
		int stop=s.nextInt();	
		 
		
		for(int st=start;st<=stop;st++) {
			String str=Integer.toString(st);
			if((str.charAt(0)==str.charAt(str.length()-1))&&(str.charAt(1)==str.charAt(str.length()-2))&&(str.charAt(0)!=str.charAt(1))){
				System.out.println(st);
			}
		}
			
	}
}