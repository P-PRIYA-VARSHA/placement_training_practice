import java.io.*;
import java.util.Scanner;
class alldigitdivide{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int ori=num;
while(num>0){
int digit=num%10;
if(digit==0|| ori%digit!=0){
System.out.println("No");
return;
}
num=num/10;

}
System.out.println("yes");
}

}
