package senthil.pirai;
import java.util.*;
public class RottenOranges {
	static void updateMatrix(int[][] a,int n,int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(a[i][j]==22)
					a[i][j]=2;
					
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int check = 0;
		int time = 0;
		int check1=0;
		int check2=0;
		do{
			++time;
			for (int k = 0; k < n; k++) {
				check = 1;
				
				for (int l = 0; l < m; l++) {
					if(a[k][l]==0||a[k][l]==2) {
						continue;
					}
					else {
						if(k==0) {
							if(l==0) {
								if(a[1][0]==0&&a[0][1]==0) {
									time=-1;
									System.out.println(time);
									check1=1;
								}
							}
							else if(l==m-1) {
								if(a[0][l-1]==0&&a[1][l]==0) {
									time=-1;
									System.out.println(time);
									check1=1;
								}
							}
							else {
								if(a[0][l-1]==0&&a[0][l+1]==0&&a[1][l]==0) {
									time=-1;
									System.out.println(time);
									check1=1;
								}
							}
						}
						else if(k==n-1) {
							if(l==0) {
								if(a[k-1][0]==0&&a[k][1]==0) {
									time=-1;
									System.out.println(time);
									check1=1;
								}
							}
							else if(l==m-1) {
								if(a[k][l-1]==0&&a[k+1][l]==0) {
									time=-1;
									System.out.println(time);
									check1=1;
								}
							}
							else {
								if(a[k][l-1]==0&&a[k][l+1]==0&&a[k+1][l]==0) {
									time=-1;
									System.out.println("a");
									check1=1;
								}
							}
						}
						else{
							if(l==0) {
								if(a[k][l+1]==0&&a[k+1][l]==0&&a[k-1][l]==0) {
									time=-1;
									System.out.println(time);
									check1=1;
								}
							}
							else if(l==m-1) {
								if(a[k][l-1]==0&&a[k+1][l]==0&&a[k-1][l]==0) {
									time=-1;
									System.out.println(time);
									check1=1;
								}
							}
							else {
								if(a[k][l-1]==0&&a[k+1][l]==0&&a[k-1][l]==0&&a[k][l+1]==0) {
									time=-1;
									System.out.println(time);
									check1=1;
								}
							}
						}
							if(check1==1) {
								break;
							}
							else {
							
								if(k==0) {
									if(l==0) {
										if(a[1][0]==2||a[0][1]==2) {
											a[k][l]=22;
										}
									}
									else if(l==m-1) {
										if(a[0][l-1]==2||a[1][l]==2) {
											a[k][l]=22;
										}
									}
									else {
										if(a[0][l-1]==2||a[0][l+1]==2||a[1][l]==2) {
											a[k][l]=22;
										}
									}
								}
								else if(k==n-1) {
									if(l==0) {
										if(a[k-1][0]==2||a[k][1]==2) {
											a[k][l]=22;
										}
									}
									else if(l==m-1) {
										if(a[k][l-1]==2||a[k+1][l]==2) {
											a[k][l]=22;
										}
									}
									else {
										if(a[k][l-1]==2||a[k][l+1]==2||a[k+1][l]==2) {
											a[k][l]=22;
										}
									}
								}
								else{
									if(l==0) {
										if(a[k][l+1]==2||a[k+1][l]==2||a[k-1][l]==2) {
											a[k][l]=22;
										}
									}
									else if(l==m-1) {
										if(a[k][l-1]==2||a[k+1][l]==2||a[k-1][l]==2) {
											a[k][l]=22;
										}
									}
									else {
										if(a[k][l-1]==2||a[k+1][l]==2||a[k-1][l]==2||a[k][l+1]==2) {
											a[k][l]=22;
										}
									}
								}
							}
				
					}
				}
				if(check1==1)
					break;
				for (int o = 0; o < n; o++) {
					for (int p = 0; p < m; p++) {
						if(a[o][p]==1) {
							check=2;
							
						}
					}
				}
				if(check!=2)
					check2=1;
				
			
			}
			if(check1==1)
				break;
			updateMatrix(a,n,m);
			System.out.println(time);
		}while(check2!=1);
		System.out.println("ended");
	}
}