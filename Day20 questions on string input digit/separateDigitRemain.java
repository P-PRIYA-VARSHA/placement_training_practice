import java.util.*;
import java.io.*;
public class separateDigitRemain{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
String str=s.next();
int num=Integer.parseInt(str);
int temp=num;
while(num>0){
int rem=num%10;
if(rem==0|| temp%rem!=0){
System.out.println("No");
return;
}
num=num/10;
}
System.out.println("Yes");
return;

}
}