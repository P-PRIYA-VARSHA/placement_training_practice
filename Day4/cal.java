import java.io.*;
import java.util.Scanner;
class cal{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter the first number");
int a=s.nextInt();
System.out.println("Enter the second number");	             
int b=s.nextInt();
System.out.println("Enter the operator");
char ch=s.next().charAt(0);
int c=0;
boolean validoperation=true;
switch(ch){
case '+':
c=a+b;
break;
case '-':
c=a-b;
break;
case '*':
c=a*b;
break;
case '/':
if(b==0){
System.out.println("Enter denominator values greater than 0");
validoperation=false;
}
else
c=a/b;
break;
case '%':
if(b==0){
System.out.println("Enter denominator values greater than 0");
validoperation=false;
}
else
c=a%b;
break;
default:
{System.out.println("Invalid input");
validoperation=false;
}
break;
}
if(validoperation)
System.out.println("result:"+c);

}
}
	             
