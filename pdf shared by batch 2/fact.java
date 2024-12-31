import java.util.Scanner;
import java.io.*;
class fact{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int fact=1;
if(num==1||num==0)
System.out.println(1);
else
{ for(int i=1;i<=num;i++)
fact=fact*i;
System.out.println(fact);

 

}

}
}