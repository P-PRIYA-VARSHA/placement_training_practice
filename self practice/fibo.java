import java.util.Scanner;
import java.io.*;
class fibo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int first=0;
int second=1;
int third;
int num=s.nextInt();
if(num==1)
System.out.println(0);
if(num==2)
System.out.println(1);
else if(num>2){
System.out.println();
for(int i=0;i<num-2;i++){
third=first+second;
first=second;
second=third;
System.out.println(third);
}
}
System.out.println("Hello, World"); 
}
}