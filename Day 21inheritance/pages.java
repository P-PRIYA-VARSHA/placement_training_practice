import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class pages{

public static void main(String args[]){

Scanner s=new Scanner(System.in);
int n=s.nextInt();
int p=s.nextInt();
int front=p/2;
int back=(n/2)-(p/2);
int res=Math.min(front,back);
System.out.println(res);

}

}