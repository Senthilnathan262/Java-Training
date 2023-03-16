import java.util.Scanner;
class SumOfDigits
{
public static void main(String[] args)
{

Scanner s= new Scanner(System.in);
String n=s.next();
int a=n.length();
int sum=0;
while(n>0) {
int temp=n%10;
sum=sum+temp;
n=n/10;

}
System.out.println("sum of digits ="+sum);
}
}