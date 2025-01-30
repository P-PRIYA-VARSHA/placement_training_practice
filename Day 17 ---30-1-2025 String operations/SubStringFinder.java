import java.util.*;
import java.io.*;

public class SubStringFinder{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");

String str=s.next();
System.out.println("all possible substrings are:-");

for(int i=0;i<str.length();i++){
for(int j=i;j<str.length();j++){
System.out.println(str.substring(i,j+1));

}
}


}
}