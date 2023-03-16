import java.util.*;
class IntersectionOfTwoArrays{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of test cases:");
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println("Test case "+i+":");
            System.out.println("Enter the length of first array/list:");
            int n=sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            System.out.println("Enter the elements of first array/list:");
            for(int j=0;j<n;j++){
                int temp1=sc.nextInt();
                arr1.add(temp1);                   
            }
            System.out.println(arr1);
            System.out.println("Enter the length of second array/list:");
            int m=sc.nextInt();
            ArrayList<Integer> arr2 = new ArrayList<Integer>();
            System.out.println("Enter the elements of second array/list:");
            for(int j=0;j<m;j++){
                int temp2=sc.nextInt();
                arr2.add(temp2);
            }
            System.out.println(arr2);
            ListIterator itr1 = arr1.listIterator();
            ListIterator itr2 = arr2.listIterator();
            ArrayList<Integer> arr3 = new ArrayList<Integer>();
            while(itr1.hasNext()){
                Integer n1 = (Integer)itr1.next();
                while(itr2.hasNext()){
                    Integer n2 = (Integer)itr2.next();
                    if(n1==n2){
                        arr3.add(n2);
                        itr2.remove();
                        break;
                    }    
                }
                itr1.remove();
            }
            System.out.println("Ans ="+arr3);
        }
    }
}
