import java.util.*;
class Diamond {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int x = n; 
       int y = n;
       for(int k=0;k<n;k++){
            for(int i=x;i>0;i--){
                System.out.print(" ");
               
            }
            x--;
            for(int j=0;j<((k*2)-1);j++){
                
                System.out.print("*");
            }
            System.out.println();
       }
        
        for(int a=0;a<n;a++){
        for(int z=0;z<a+2;z++){
           System.out.print(" ");
        }
           for(int i =((y-2)*2)-1;i>0;i--){
                System.out.print("*");
               
           }
           y--;
           System.out.println();
       }
      
       
       
    }
}
