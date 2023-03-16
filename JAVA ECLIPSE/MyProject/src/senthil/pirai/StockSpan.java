package senthil.pirai;

import java.util.Scanner; 
import java.util.StringTokenizer;

public class StockSpan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int[] a = new int[n];
		int i=0;
        while(st.hasMoreTokens()){
            a[i]=Integer.parseInt(st.nextToken());
            i++;
        }
        System.out.println();
        for(int x=0;x<n;x++) {
        	int count = 1;
        	int check = 0;
        	if(x==0) {
        		System.out.print(count+" ");
        		continue;
        	}
        	for(int y=x-1;y>=0;y--) {
        		if(a[y]>=a[x]) {
        			System.out.print(count+" ");
        			check=1;
        			break;
        		}
        		else {
        			count++;
        			continue;
        			
        		}
        	}
        	if(check==0) {
        		System.out.print(x+1+" ");
        	}
        	
        }
     sc.close();   
	}

}
