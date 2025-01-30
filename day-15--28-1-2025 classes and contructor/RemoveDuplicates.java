//remove duplicate values in an array using functions
import java.io.*;
import java.util.*;
public class RemoveDuplicates{

static int[] RemoveElement(int arr[]){
TreeSet<Integer> x=new TreeSet<>();
for(int n:arr){
x.add(n);
}
int[] copy=new int[x.size()];
int count=0;
for(int n1:x)
{ copy[count]=n1;
count++;

}
return copy;

}

public static void main(String args[]){



Scanner s=new Scanner(System.in);
int num=s.nextInt();
int[] arr=new int[num];
for(int i=0;i<num;i++)
arr[i]=s.nextInt();

int[] res=RemoveElement(arr);
for(int n2:res)
System.out.print(n2+" ");




}
}