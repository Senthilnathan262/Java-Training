import java.util.*;
class NumberPattern{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=1;
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=k;
            k+=2;
            
        }
        
        for(int m=0;m<n;m++){
            
            int z=m;
            for(int j=0;j<n;j++){
               
               System.out.print(arr[z]+" ");
               if(z>=n-1){
                    z=0;
               } 
               else{
                    z+=1;
               }
            }
        System.out.println();
        }
        
   }
}          
    
