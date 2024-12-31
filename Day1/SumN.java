import java.util.Scanner;
class SumN{
public static void main(String args[]){
System.out.println("Enter the No. to find the sum of N natural numbers:");
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int sum=0;
int i=1;
do{
sum=sum+i;
i++;
}while(i<=n);

System.out.println("sum is :"+sum);
}
}