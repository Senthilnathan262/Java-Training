import java.util.*;
class EnumerationDemo{
     public static void main(String[] args){
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            v.addElement(sc.nextInt());
        }
        System.out.println(v);
        Enumeration en = v.elements();
        while(en.hasMoreElements()){
            Integer in = (Integer)en.nextElement();
            if(in%2!=0){
                System.out.print(in+" ");
                v.removeElement(in);//removing using vector method(enumeration doesn't have remove method)
            }   
        }
        System.out.println();
        System.out.println(v);
     }
}
