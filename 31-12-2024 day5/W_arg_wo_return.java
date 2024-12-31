import java.io.*;
import java.util.Scanner;

class W_arg_wo_return{

static void sumofnum(int a,int b){
int c=a+b;
System.out.println("sum of number is : "+c);


}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();

sumofnum(a,b);

}
}