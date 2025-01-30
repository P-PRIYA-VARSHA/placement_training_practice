import java.util.*;
import java.io.*;
import java.util.Map.Entry;
public class NonRepeatedDigitsCount{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int count=0;
String str=Integer.toString(num);
HashMap<Character,Integer> x=new HashMap<>();
for(char i:str.toCharArray())
x.put( i,x.getOrDefault(i,0)+1);
for(Entry<Character,Integer> n :x.entrySet())
{
if(n.getValue()==1)
count++;
}
System.out.println(count);


}
}