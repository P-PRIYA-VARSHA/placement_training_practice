import java.util.Scanner;
class fibno{
static boolean fib(int n){
int ch1=5*n*n+4;
int ch2=5*n*n-4;
return sq(ch1)||sq(ch2);
}
static Boolean sq(int x){
int sq=int(Math.sqrt(x));
return sq*sq=x;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(fib(n))
System.out.println("The given no. is fib");
else
System.out.println("The given no. is not fib");
}
}






