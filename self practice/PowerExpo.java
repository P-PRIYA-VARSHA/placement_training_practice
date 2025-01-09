import java.util.Scanner;

class PowerExpo{

static int fun(int base,int expo){
int result=1;
for(int i=0;i<expo;i++)
result=result*base;
return result;

}


public static void main(String args[]){


Scanner s=new Scanner(System.in);
System.out.println("Enter the base");
int base=s.nextInt();
System.out.println("Enter the exponent");
int expo=s.nextInt();

System.out.println(fun(base,expo));





}

}