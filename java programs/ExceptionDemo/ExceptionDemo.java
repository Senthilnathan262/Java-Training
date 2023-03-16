import java.util.*;
class DemoExceptionC extends Exception{
    DemoExceptionC(String s1){
        super(s1);
    }
}
class DemoExceptionc extends Exception{
     DemoExceptionc(String s2){
        super(s2);
    }
}

class ExceptionDemo{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        try{
            if(s.equals("C++")){
                throw new DemoExceptionC(s);
            }
            else if(s.equals("c++")){
                throw new DemoExceptionc(s);
            }
            else{
                System.out.println("No exception");
                
            }
        }
        catch(DemoExceptionC s1){
            System.out.println("Inside catch block");
           
        }
        catch(DemoExceptionc s2){
            System.out.println("Inside catch block");
            
        }
        finally{
            System.out.println("String val is "+s);
        }
     }
}
