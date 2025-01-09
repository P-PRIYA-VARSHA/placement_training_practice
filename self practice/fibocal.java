import java.util.Scanner;

class fibocal{

static void fib(int num){
int first=0;
int second=1;
int third=0;
System.out.println("Fibonacci number is:");

System.out.println(first);
System.out.println(second);


for(int i=1;i<=num-2;i++)
{ third=first+second;
System.out.println(third);
first=second;
second=third;

}



}


public static void main(String args[]){


Scanner s=new Scanner(System.in);
System.out.println("enter the number");

int num=s.nextInt();
fib(num);





}

}