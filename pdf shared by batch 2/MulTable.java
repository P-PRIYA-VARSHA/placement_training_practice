import java.io.*;
import java.util.Scanner;
class MulTable{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter the number for table:");
int num=s.nextInt();
System.out.println("The table for "+num+" is : ");
for(int i=1;i<=10;i++)
System.out.println(num+" "+"x "+i+" "+"= "+i*num);
}
}

