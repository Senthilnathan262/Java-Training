package senthil.pirai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
import java.util.StringTokenizer;

public class SetMismatch {
	int[] setMismatch(Object[] arr,HashSet s) {
		
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		int[] res = new int[2];
		ArrayList al = new ArrayList(s);
		if(s.size()==1) {
			res[0]=1;
			int x = (int)al.get(0);
			res[1]=x+1;
		}
		else {
			for(int j=0;j<s.size()-1;j++) {
				int x = (int)al.get(j);
				int y = (int)al.get(j+1);
				if(x+1==y) {
					continue;
				}
				else {
					res[0]=j+1;
					res[1]=x+1;
				}
			}
			
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str,",");
		ArrayList a = new ArrayList(); 
		while(st.hasMoreTokens()) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		Object[] arr = a.toArray();
		SetMismatch sm = new SetMismatch();
		HashSet<Integer> s = new HashSet<Integer>();
		int[] ans = sm.setMismatch(arr,s);
		for(int z=0;z<2;z++) {
			System.out.print(ans[z]+" ");
		}
		sc.close();
	}

}
