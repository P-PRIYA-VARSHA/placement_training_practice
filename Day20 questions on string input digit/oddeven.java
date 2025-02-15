import java.io.*;
import java.util.Scanner;
class oddeven{

public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
String str=s.next();
int odd=0;
int even=0;
while(num>0){
int rem=num%10;
if(rem%2==0)
even=even+rem;
else
odd=odd+rem;
num=num/10;
}
if(str.equals("even"))
System.out.print(even);
else
System.out.print(odd);




}

}