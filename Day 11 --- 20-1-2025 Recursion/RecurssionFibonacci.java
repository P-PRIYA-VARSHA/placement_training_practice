import java.io.*;
import java.util.Scanner;
public class RecurssionFibonacci{
static int fact(int n){
if(n==0||n==1)
return 1;
else
return n*fact(n-1);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int fact=fact(n);
System.out.println("The factorial of "+n+" is: "+fact);
}
}