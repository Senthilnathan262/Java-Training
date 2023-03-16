import java.util.*;
class MaxNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] num = n.toCharArray();
        String s1 = String.valueOf(num[0]);
        String s2 = String.valueOf(num[1]);
        String s3 = String.valueOf(num[2]);
        String s4 = String.valueOf(num[3]);
        int num1 = Integer.parseInt(s1+s2+s3);
        int num2 = Integer.parseInt(s1+s2+s4);
        int num3 = Integer.parseInt(s1+s3+s4);
        int num4 = Integer.parseInt(s2+s3+s4);
        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println(num1);    
        }
        else if(num2>num1 && num2>num3 && num2>num4){
            System.out.println(num2);    
        }
        else if(num3>num1 && num3>num2 && num3>num4){
            System.out.println(num3);    
        }
        else
            System.out.println(num4);
    }
}
