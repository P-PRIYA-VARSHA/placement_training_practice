import java.io.*;
import java.util.Scanner;
import java.util.HashSet;
public class match{

public static void main (String args[]){
String[] keywords={"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
Scanner s=new Scanner(System.in);
String str=s.next();
HashSet<String> x=new HashSet<>();
for(String key:keywords){
x.add(key);
if(x.contains(str)){
System.out.println(str+" is a keyword");

return;
}

}
System.out.print(str+" is not a keyword");

}
}