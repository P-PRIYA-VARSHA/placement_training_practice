import java.util.Scanner;

class NthFibonacci{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int a=0;
int b=1;
int third=0;
for(int i=3;i<=num;i++){
third=a+b;
a=b;
b=third;
}
System.out.println("The Nth number of the Fibonacci "+num+" is: "+third);
}
}
