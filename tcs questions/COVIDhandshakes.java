import java.io.*;
import java.util.Scanner;
class COVIDhandshakes{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=s.nextInt();
for(int i=0;i<n;i++){
System.out.println((arr[i]*(arr[i]-1))/2);

}
}
}