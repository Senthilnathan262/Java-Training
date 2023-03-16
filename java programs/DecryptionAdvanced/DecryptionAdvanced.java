import java.util.*;
class DecryptionAdvanced{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int l=str.length();
        int start=0;
        for(int i=0;i<l;i++){
            char tempchar=str.charAt(i);
            int temp=tempchar-'0';
            if(temp>9){
                continue;
            }
            else{
                for(int j=0;j<temp;j++){
                    for(int k=start;k<i;k++){
                        System.out.print(str.charAt(k));
                    }
                    
                }
                start=i+1;
            }
           
        }
       
    }
}

	

