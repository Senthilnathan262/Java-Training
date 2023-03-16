package senthil.pirai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringUsingQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		int max=0;
		Queue s = new LinkedList();
		ArrayList a = new ArrayList();
		
		for (int i = 0; i < ch.length; i++) {
				int j=i;
				while(j<ch.length){
					int check=0;
					for(int x=0;x<a.size();x++) {
						if((char)a.get(x)==ch[j]) {
							check=1;
							if(s.size()>max) {
								max=s.size();
							}
							a.clear();
							s.clear();
							break;
						}
					}
					if(check==0)
						s.add(ch[j]);
					else
						break;
					j++;
					a = new ArrayList(s);
					
					
				}
				
				
			
			
		}
		System.out.println(max);

		sc.close();
	}

}
