import java.util.Scanner;
class largass{
static void fun(int num1, int num2, int num3){
if(num1>num2&&num1>num3)
System.out.println("num1"+num1+"is greater");
else if (num2>num3)
System.out.println("num2 "+num2+"is greater");
else
System.out.println("num3"+num3+"is greater");

}
public static void main(String args[]){

Scanner s= new Scanner(System.in);
int num1=s.nextInt();
int num2=s.nextInt();
int num3=s.nextInt();
fun(num1,num2,num3);
}}


