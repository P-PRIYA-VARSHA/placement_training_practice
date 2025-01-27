import java.util.Arrays;
import java.util.Scanner;
public class RemovedArray{
public static void main(String args[]){
int arr[]=new int[]{97,23,67,23,1,2,3};
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int count=0;
for(int i=0;i<arr.length;i++){
if(arr[i]!=num){
arr[count]=arr[i];
count++;
}
}
while(count<arr.length){
arr[count]=0;
count++;
}
for(int n:arr)
System.out.print(n+" ");




}
}


