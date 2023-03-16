import java.util.*;
class Palindrome1{


void findPalinrome(int num) {
  int initNumber = num;
  int temp = 0;
  int initTemp = num;

  while (initTemp > 0) {
    int l = initTemp % 10;
    temp = (temp * 10) + l;
    initTemp = initTemp / 10;
  }
  if (temp == initNumber) {
   finalCheck(initNumber);
  }
}

void finalCheck(int num) {
  int lastNo = num % 10;
  int temp = num;
  boolean checked =  false;
  while (temp > 0) {
    int l = temp % 10;
    if (l != lastNo) {
      checked = true;
      break;
    }
    temp = temp/10;
  }  
   if(checked){
     System.out.println(num);
   }
 
}



	 public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Palindrome1 p = new Palindrome1();
		System.out.println("enter start value:");
		int start=s.nextInt();
		System.out.println("enter stop value:");
		int stop=s.nextInt();
		for(int i=start;i<=stop;i++){
		p.findPalinrome(i);
			
		}	
			
	}
}

					
			
