import java.util.Scanner;
import java.io.*;
class LargDigi{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int larg=0;
int i=1;
while(i<=num){
int rem=num%10;
if(larg<rem)
larg=rem;
num=num/10;
i++;

}
System.out.println("larg of digits are:"+larg);
}
}