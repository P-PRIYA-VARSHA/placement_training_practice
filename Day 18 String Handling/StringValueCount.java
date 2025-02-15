import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class StringValueCount{

public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str=s.next();
LinkedHashMap<Character, Integer> x=new LinkedHashMap<>();
for(char ch: str.toCharArray())
{
x.put(ch,x.getOrDefault(ch,0)+1);
System.out.println(x);
}
for(Entry<Character,Integer> n:x.entrySet())
System.out.println(n.getKey()+" Occurs: "+n.getValue());
}
}

