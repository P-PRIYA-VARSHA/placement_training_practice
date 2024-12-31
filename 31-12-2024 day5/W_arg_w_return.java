import java.io.*;
import java.util.Scanner;

class W_arg_w_return{

static int sumofnum(int a,int b){
int c=a+b;
return c;

}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();

int res=sumofnum(a,b);
System.out.println("sum is : "+res);

}
}