import java.util.Scanner;
import java.io.*;
class SumDigi{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int sum=0;
int i=1;
while(i<=num){
int rem=num%10;
sum=sum+rem;
num=num/10;
i++;

}
System.out.println("Sum of digits are:"+sum);
}
}