import java.util.Scanner;

class LogicalOperatorBool
{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
boolean a=s.nextBoolean();
boolean b=s.nextBoolean();

System.out.println(a&&b);
System.out.println(a||b);
System.out.println(!a);
System.out.println(a!=b);



}

}