import java.io.*;
import java.util.Scanner;
class nodigit{
void fun(int num){
int count=0;
int a=num;
for(int i=0;num>0;i++){
int digit=num%10;
count++;
num=num/10;
}
System.out.println("The number of digits in "+a+" is:"+count);}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
nodigit obj=new nodigit();
obj.fun(num);
}
}