import java.io.*;
import java.util.Scanner;
class StringReverseRecursion{
static String Reverse(String s){
if(s.isEmpty())
return s;
else
return Reverse(s.substring(1))+s.charAt(0);
}
public static void main(String args[]){

Scanner s=new Scanner(System.in);
String str=s.nextLine();
System.out.println(Reverse(str));
}
}
