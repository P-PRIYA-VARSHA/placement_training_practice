import java.io.*;
import java.util.Scanner;
import java.util.*;
public class StringTransform{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String sa=str.replaceAll(", " , "");
System.out.println(sa.toUpperCase());
}
}