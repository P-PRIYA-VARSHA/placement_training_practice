import java.util.Scanner;
class terlarg{

public static void main(String args[]){

Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int n3=s.nextInt();
int large= (n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
System.out.println(large);
}}
