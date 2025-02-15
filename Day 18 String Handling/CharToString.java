import java.io.*;
import java.util.Scanner;
import java.util.*;
public class CharToString{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
char[] ch=new char[n];
for(int i=0;i<n;i++)
ch[i]=s.next().charAt(0);

String str=new String(ch);
System.out.print(str);
}
}