import java.util.*;
class NumStarPattern{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =n;
        while(i>=1){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print("*");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();           
            i--;
        }
    }
}
