//SQUARE AND CUBE
import java.io.*;
import java.util.Scanner;
class sqcu{

static void fun(int n){
int sq=0;
int cu=0;
if(n>=0){
System.out.print("The Square of first "+n+" natural numbers are ");
int i=1;
while(i<=n)
{
sq=i*i;
System.out.print(sq);
if(i<n)
System.out.print(", ");
i++;
}
System.out.println();
System.out.print("The cube of first "+n+" natural numbers are ");
 i=1;
while(i<=n)
{
cu=i*i*i;
System.out.print(cu);
if(i<n)
System.out.print(", ");
i++;
}
System.out.println();
}else
System.out.println("enter valid input");

}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
fun(n);

}
}
