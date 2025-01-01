import java.util.Scanner;
import java.io.*;
class prime{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();

int count=0;
int i;
for(i=1;i<=num;i++)
{ if(num%i==0)
count++;

}
if(count==2)
System.out.println(num+" is a prime number");
else
System.out.println(num+" is not a prime number");

}
}
