import java.io.*;
import java.util.Scanner;
public class ChartoUpper{
void charUpper(char ch[]){
int count=0;
for(char c: ch){
System.out.print(Character.toUpperCase(c));
count++;
if(count<ch.length)
System.out.print(", ");

}



}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
ChartoUpper obj=new ChartoUpper();
int n=s.nextInt();
char ch[]=new char[n];
for(int i=0;i<n;i++)
ch[i]=s.next().charAt(0);
obj.charUpper(ch);

}


}



