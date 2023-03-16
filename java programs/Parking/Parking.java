import java.util.*;

class Checking{
    void check(int N1,int N2,int N3,int N4,int N,int[] arr){
        
        if(N>=(N1+N2+N3+N4)){
            System.out.println("EXT");
        }
        else{
            int x=0;
            for(int i=0;i<4;i++){
               if(N>=arr[i]){
                    N=N-arr[i];                    
                }
                else{
                    x=i;
                    break;
                } 
               
            }
       if(x==0)
           System.out.println("B1");
       else if(x==1)
           System.out.println("B2");
       else if(x==2)
           System.out.println("B3");
       else
           System.out.println("B4");
            
            
       }
          
    }
}

class Parking{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int N4 = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[]{N1,N2,N3,N4};
        Checking ch = new Checking();
        ch.check(N1,N2,N3,N4,N,arr);
//        switch(ans){
//            case 0:
//                System.out.println("B1");
//            case 1:
//                System.out.println("B2");
//            case 2:
//                System.out.println("B3");
//            case 3:
//                System.out.println("B4");
//            case 4:
//                System.out.println("EXT");
        
        
    }
}
