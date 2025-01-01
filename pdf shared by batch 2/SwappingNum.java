import java.io.*;
import java.util.Scanner;

class SwappingNum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter first number:");
int n1=s.nextInt();
System.out.println("Enter second number:");
int n2=s.nextInt();
System.out.println("before swapping:");
System.out.println("Enter first number: "+n1);
System.out.println("Enter second number: "+n2);
System.out.println("After swapping:");
int temp=0;
temp=n1;
n1=n2;
n2=temp;
System.out.println("first number: "+n1);
System.out.println("second number: "+n2);





}


}