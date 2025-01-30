import java.util.*;
import java.io.*;
public class GuestEntry{

public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
int[] arr1=new int[n];
for(int i=0;i<n;i++)
arr[i]=s.nextInt();
for(int i=0;i<n;i++)
arr1[i]=s.nextInt();
int sum=0;
int max=0;
for(int i=0;i<n;i++){
sum=sum+arr[i]-arr1[i];
if(sum>max)
max=sum;
}
System.out.println("The maximum no. of guest are:"+max);

}
}