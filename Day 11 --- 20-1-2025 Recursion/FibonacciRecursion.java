import java.io.*;
import java.util.Scanner;
public class FibonacciRecursion{
static int fib(int n){
if(n<=1)
return n;
else
return (fib(n-1)+fib(n-2));
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println("The sum of recursion of "+n+" is: ");
for(int i=0;i<n;i++){
System.out.println(fib(i));
}

}
}

