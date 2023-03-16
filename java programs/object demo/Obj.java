import java.util.Scanner;
class calc{
	int a,b;
	int add(){
		return a+b;
	}
	int sub(){
		return a-b;
	}
	int mul(){
		return a*b;
	}
	float div(){
		return a/b;
	}

}



class Obj{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		a=sc.nextInt();
		b=sc.nextInt();
		calc obj=new calc();
		System.out.println(obj.add());
		obj.sub();
		obj.mul();
		obj.div();
}
}