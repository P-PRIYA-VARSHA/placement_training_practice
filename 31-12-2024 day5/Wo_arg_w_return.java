import java.io.*;
import java.util.Scanner;

class Wo_arg_w_return{

static int sumofnum(){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=a+b;
return c;

}

public static void main(String args[]){

int res=sumofnum();
System.out.println("sum of number is : "+res);


}
}