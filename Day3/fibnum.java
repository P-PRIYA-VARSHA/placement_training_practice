import java.io.*;
import java.util.Scanner;
class fibnum{
boolean isfib(int n)
{
int ch1=5*(n*n)+4;
int ch2=5*(n*n)-4;
return sqr(ch1)||sqr(ch2);

}
boolean sqr(int x)
{
int sq=(int)Math.sqrt(x);
return sq*sq==x;
}
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
int n=s.nextInt();
fibnum obj=new fibnum();
if(obj.isfib(n))
System.out.println(n+" is a fibonacci number.");
else 
System.out.println(n+" is not fibonacci number.");

}
}