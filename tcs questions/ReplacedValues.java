import java.io.*;
import java.util.Scanner;
public class ReplacedValues{

public static void main(String args[]){

String str="0123456789";
String str1="9876543210";
Scanner s=new Scanner (System.in);
int num=s.nextInt();
String str4="";
String str3=Integer.toString(num);
for(int i=0;i<str3.length();i++){
for(int j=0;j<str.length();j++){
if(str3.charAt(i)==str.charAt(j)){
str4=str4+str1.charAt(j);

}

}


}

System.out.print(str4);
}

}