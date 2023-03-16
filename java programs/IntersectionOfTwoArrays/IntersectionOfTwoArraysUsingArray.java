import java.util.*;

class IntersectionOfTwoArraysUsingArray{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of test cases:");
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println("Test case "+i+":");
            System.out.println("Enter the length of first array/list:");
            int n=sc.nextInt();
            int[] arr1 = new int[n];
            System.out.println("Enter the elements of first array/list:");
            for(int j=0;j<n;j++){
                int temp1=sc.nextInt();
                
            
                arr1[j]=temp1;                   
            }
            
            System.out.println("Enter the length of second array/list:");
            int m=sc.nextInt();
            int[] arr2 = new int[m];
            System.out.println("Enter the elements of second array/list:");
            for(int j=0;j<m;j++){
                int temp2=sc.nextInt();
                arr2[j]=temp2;
            }
            
            for(int x=0;x<n;x++){
                for(int y=0;y<m;y++){
                    if(arr1[x]==arr2[y]){
                        System.out.print("Ans =");
                        System.out.print(arr1[x]+" ");
                        
                        arr2[y]=Integer.MIN_VALUE;
                        break;
                    }
                }
                        
            }
            System.out.println();
        }   
    }
}
