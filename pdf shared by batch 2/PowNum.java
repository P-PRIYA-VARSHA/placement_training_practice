import java.util.Scanner;
import java.io.*;
class PowNum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int pow=s.nextInt();
int result=1;
for(int i=1;i<=pow;i++){
result=result*num;}

System.out.println("The power of exponent is: "+result);
}
}


