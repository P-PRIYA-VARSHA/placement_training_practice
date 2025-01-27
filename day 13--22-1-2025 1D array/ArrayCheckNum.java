import java.util.Arrays;
import java.util.Scanner;
public class ArrayCheckNum{
public static void main(String args[]){
int arr[]=new int[]{1,2,3,4,5};
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int flag=0;
for(int i=0;i<arr.length;i++){
if(arr[i]==num){
System.out.println("Number is there");
flag=1;
break ;}
}
if(flag==0)
System.out.println("Number is not there");

}
}