import java.util.Scanner;
class Pyramid2{
    public static void main(String args[]){
        int i=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(i<n){
            int j=0;
            while(j<=n-i){
                System.out.print(" ");
                j++;            
            }
            int k=0;
            while(k<i){
                System.out.print("* ");
                
                k++;
            }
            i++;
            System.out.println();
        }
       
            
    }
}
