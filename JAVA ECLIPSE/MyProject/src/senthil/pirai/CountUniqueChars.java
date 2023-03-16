package senthil.pirai;

import java.util.Scanner;

public class CountUniqueChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a string:");
			String str = sc.next();
			StringBuilder sb = new StringBuilder(str);
			if(sb.length()<0||sb.length()>105) {
				System.out.println("Please enter a string of length from 1 to 105");
				continue;
			}
			else {
				int count = 0;
				int l = sb.length();
				for(int i=0;i<l;i++) {
					if(i==0) {
						count=l;
					}
					else {
						for(int j=0;j<l-i;j++) {
							String str1 = sb.substring(j, j+i+1);
							char[] string1 = str1.toCharArray();  
					          
					         
					        for(int x = 0; x <string1.length; x++) {  
					            int count1 = 0;  
					            for(int y = x+1; y <string1.length; y++) {  
					                if(string1[x] == string1[y] ) {  
					                    count1++;  
					                    string1[y] = '0'; 
					                    
					                }  
					            }  
					             
					            if(count1 == 0 && string1[x] != '0')  
					                count++; 
							
							
							
						}
					}
				}
			}
				System.out.println(count);
		break;		
		}

	}
		sc.close();
	}
}
