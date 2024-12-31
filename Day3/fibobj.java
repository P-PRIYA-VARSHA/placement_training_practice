import java.io.*;
import java.util.Scanner;
class fibobj{

void fun(int n){

int first=0;
int second=1;
int third=0;
if(n>1)
System.out.print(first+" "+second);
else if(n==1)
System.out.print(first);
else 
System.out.println("invalid input");

for (int i=0;i<n-2;i++){
third=first+second;
first=second;
second=third;
System.out.print(" "+third);
}
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
fibobj obj=new fibobj();
obj.fun(n);
}
}
