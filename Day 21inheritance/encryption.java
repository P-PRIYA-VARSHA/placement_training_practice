import java.io.*;
import java.util.Scanner;
class encryption{

public static void main(String args[]){
Scanner s=new Scanner(System.in);
String actual="abcdefghijklmnopqrstuvwxyz";
String cipher ="kptvwxyzabcdefghijlmnoqsu";
String str=s.next();
String str1="";
for(int i=0;i<str.length();i++){
char c=str.charAt(i);
for(int j=0;j<26;j++){

if(c==actual.charAt(j)){
str1=str1+cipher.charAt(j);
}

}

}
System.out.println(str1);


}
}