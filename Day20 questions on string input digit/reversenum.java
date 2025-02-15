//16 signed integer.
import java.io.*;
import java.util.Scanner;
class reversenum{
public static void main(String Rags[]){
Scanner s=new Scanner(System.in);
String num=s.next();
int temp=num;
int rev=0;
int rem=0;
if(temp<-32767|| temp>32767){
System.out.print("Wrong Values");
return;
}
while(temp>0){

rem=temp%10;
rev=rev*10+rem;
temp=temp/10;

}
if(rev<-3276|| rev>32767){
System.out.print("Wrong Values");
return;

}
System.out.print(rev);


}
}