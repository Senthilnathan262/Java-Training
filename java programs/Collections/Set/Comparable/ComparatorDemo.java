import java.util.*;
class ComparatorDemo{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        TreeSet h = new TreeSet(new MyComparator());
        while(true){
            
            int temp = s.nextInt();
            h.add(temp);
            System.out.println("do you want to continue adding elements(y/n)?");
            char choice = s.next().charAt(0);
            if(choice=='n')
                break;
        }
       
        System.out.println(h);
       
        
    }

    
}
class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;
        if(i1<i2)
            return +1;
        else if(i1>i2)
            return -1;
        else 
            return 0;
    }
}
