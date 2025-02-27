import java.io.*;
import java.util.Scanner;
public class cipher{
public static void main(String args[]){
String actual="abcdefghijklmnopqrstuvwxyz";
String cipher="kptvwxyzabcdefghijlmnoqrsu";
Scanner s=new Scanner(System.in);
String str=s.next();
String str4="";
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
for(int j=0;j<26;j++){
if(ch==actual.charAt(j)){
str4=str4+cipher.charAt(j);
}

}

}
System.out.println(str4);

}

}