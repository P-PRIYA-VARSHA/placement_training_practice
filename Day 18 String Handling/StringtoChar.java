import java.io.*;
import java.util.Scanner;
public class StringtoChar{
void CharArray(String str){
int count=0;
for(char n:str.toCharArray())
{count++;
System.out.print(n+" ");
if(count<str.length())
System.out.print(", ");
}



}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
StringtoChar obj=new StringtoChar();

String str=s.next();
obj.CharArray(str);

}
}

