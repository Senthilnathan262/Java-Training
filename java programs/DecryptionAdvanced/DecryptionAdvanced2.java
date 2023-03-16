
import java.util.*;
class DecryptionAdvanced2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int l=str.length();
        int start=0;
        for(int i=0;i<l;i++){
            int z=i+1;
            char tempchar=str.charAt(i);
            int temp=tempchar-'0';
            String x=String.valueOf(temp);
            if(temp>9){
                continue;
            }
            else{
               
                while(z<=str.length()-1){
                    
                    char tempchar2=str.charAt(z);
                    int temp2=tempchar2-'0';
                    if(temp2>9){
                        break;
                    }
                    else{
                        x=x+String.valueOf(temp2);
                        z++;
                    }
                }
                int x1=Integer.parseInt(x);
                for(int j=0;j<x1;j++){
                    for(int k=start;k<i;k++){
                        System.out.print(str.charAt(k));
                    }
                }
                    
                
                start=i+1;
            }
           
        }
       
    }
}
