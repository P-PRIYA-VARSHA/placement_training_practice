import java.io.*;
import java.util.Scanner;
public class SumRecursion{
static int sum(int n){
if(n==0)
return 0;
else
return n+sum(n-1);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println("The sum of recursion of "+n+" is: "+sum(n));
}
}



