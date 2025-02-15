import java.io.*;
import java.util.Scanner;
public class AsciiOfChar{
void printAscii(int data[]){

System.out.println("The ascii value is: ");
System.out.println("Char \t\t\t ASCII value");
for(int i=0;i<data.length;i++)
System.out.println((char)data[i]+"\t\t\t"+data[i]);


}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
AsciiOfChar obj=new AsciiOfChar();

 System.out.println("Enter the size of array");
int n=s.nextInt();
char[] ch=new char[n];
System.out.println("Enter the array elements ");

for(int i=0;i<n;i++)
ch[i]=s.next().charAt(0);
int[] data=new int[n];
for(int i=0;i<n;i++)
data[i]=(int)ch[i];
obj.printAscii(data);



}
}