import java.util.*;
import java.io.*;
import java.util.Map.Entry;
public class Frequency{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int[] arr=new int[num];
for(int i=0;i<num;i++)
arr[i]=s.nextInt();

HashMap<Integer,Integer> x=new HashMap<>();
for(int n:arr){
x.put(n,x.getOrDefault(n,0)+1);
System.out.println(x);}

for(Entry<Integer,Integer> n: x.entrySet()){

System.out.println(n.getKey()+" occurs "+n.getValue()+" times.");

}
}
}

