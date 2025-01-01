import java.io.*;
import java.util.Scanner;
class PalindromeNumber{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int num=s.nextInt();
int temp=num;
int rev=0;
int rem=0;
while(num!=0){
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
if(temp==rev)
System.out.println("it is a palindrome number");
else
System.out.println("it is not a palindrome number");


}
}

