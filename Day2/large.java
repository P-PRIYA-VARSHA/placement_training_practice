import java.util.Scanner;
public class large{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
if (n1>n2)
System.out.println("n1 is greater");
else if (n2>n1)
System.out.println("n2 is greater");
else
System.out.println(" both are same");
}
}


