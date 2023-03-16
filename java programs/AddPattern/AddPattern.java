import java.util.*;
class AddPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                int total = 0;
                while(true){
                    
                    if(j==i){
                        total+=j;
                        System.out.print(j+"="+total);
                        System.out.println();
                        break;
                    }
                    else{
                        total+=j;
                        System.out.print(j+"+");
                        j++;
                    }
                }
            j++;
            }
        i++;
        }
    }
}
