import java.util.*;
import java.io.*;
class oddSubeven{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
String str=s.next();
int odd=0;
int even=0;
for(int i=0;i<str.length();i++){
int rem=Character.getNumericValue(str.charAt(i));
if((i+1)%2==0)
even=even+rem;
else
odd=odd+rem;
}
System.out.print(odd-even);

}
}