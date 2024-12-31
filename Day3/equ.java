import java.io.*;
import java.util.Scanner;
class equ{
void findvalue(int a,int b ,int c)
{
int total=(int)Math.pow(a,3)+(int)Math.pow(a,2)*b+2*(int)Math.pow(a,2)*b+2*a*(int)Math.pow(b,2)+a*(int)Math.pow(b,2)+(int)Math.pow(b,3);
System.out.println(total);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
equ obj=new equ();
obj.findvalue(a,b,c);
}
}