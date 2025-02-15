import java.io.*;
import java.util.Scanner;
public class SumAscii{
int AsciiSum(String str){
int sum=0;
for(int i=0;i<str.length();i++)
sum=sum+(int)str.charAt(i);
return sum;

}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
SumAscii obj=new SumAscii();
String str=s.next();
System.out.print("The sum is:");
System.out.print(obj.AsciiSum(str));
}
}
