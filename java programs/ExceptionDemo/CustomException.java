import java.util.*;

class CustomException extends Exception{
    public String toString(){
        return "Inside catch block";
    }
}

class CustomException{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String ex = sc.next();
        try{
            if(ex.equals("C++")||ex.equals("c++")){
                throw new CustomException(s);
            }
            else{
                System.out.println("No Exception");
            }
        }
        catch(CustomException s){
            System.out.println(s);
        }
        finally{
            System.out.println("String val is "+ex);
        }
    }
}
