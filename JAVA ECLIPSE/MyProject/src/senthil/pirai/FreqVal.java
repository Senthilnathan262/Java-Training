package senthil.pirai;


import java.util.Scanner;
import java.util.StringTokenizer;

public class FreqVal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			StringBuilder a = new StringBuilder();
			while(st.hasMoreTokens()){
				a.append(st.nextToken());
			}
			if(a.length()>100||a.length()<2) {
				System.out.println("Please enter a string of length from 2 to 100");
				continue;
			}
			else if(a.length()%2!=0) {
				System.out.println("String's length should be an even number ");
				continue;
			}
			else {
				for(int i=0;i<a.length()-1;i+=2) {
					String temps = a.substring(i, i+2);
					String ts1 = String.valueOf(temps.charAt(0));
					int temp1 = Integer.parseInt(ts1);
					String ts2 = String.valueOf(temps.charAt(1));
					int temp2 = Integer.parseInt(ts2);
        	
					for(int j=0;j<temp1;j++) {
						System.out.print(temp2+" ");
					}
				}
				break;
			}  

		}
	sc.close();
	}
}
