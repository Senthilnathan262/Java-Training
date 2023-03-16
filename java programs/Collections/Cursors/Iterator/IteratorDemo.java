import java.util.*;
class IteratorDemo{
    public static void main(String args[]){
        ArrayList arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr.add(i);
        }
        System.out.println(arr);
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            Integer i = (Integer)itr.next();
            if(i%2!=0){
               System.out.print(i+" ");
               itr.remove();
            }
            
        }
        System.out.println();
        System.out.println(arr);
    }
}
