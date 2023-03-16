import java.util.*;
class TreeSetDemo{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        TreeSet h = new TreeSet();
        while(true){
            
            int temp = s.nextInt();
            h.add(temp);
            System.out.println("do you want to continue adding elements(y/n)?");
            char choice = s.next().charAt(0);
            if(choice=='n')
                break;
        }
       
        System.out.println(h);
        System.out.println(h.first());
        System.out.println(h.last());
        System.out.println(h.headSet(4));
        System.out.println(h.tailSet(4));
        System.out.println(h.subSet(2,4));

    }

    
}
