import java.io.*;
import java.util.Scanner;
class sumdigit{
int fun(int num){
if(num<10)
return num;
else{
int sum=0;
while(num>0){
int rem=num%10;
sum=sum+rem;
num=num/10;
}
return fun(sum);

}
}


public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();

sumdigit obj=new sumdigit();
int re=obj.fun(num);
System.out.println("The sum of digits "+num+" is: "+re);

}
}