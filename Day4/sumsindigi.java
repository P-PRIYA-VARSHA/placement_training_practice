import java.io.*;
import java.util.Scanner;
class sumsindigi{
public static void main(String args[]){

Scanner s=new Scanner(System.in);

int n=s.nextInt();
while(n>=10){
int sum=0;
while(n>0){
sum=sum+n%10;
n=n/10;
}
n=sum;
}
System.out.println("Sum of digits are:"+n);
}
}

