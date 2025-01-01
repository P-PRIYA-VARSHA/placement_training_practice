import java.util.Scanner;
import java.io.*;
class EvenRang{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int count=0;
for(int i=0;i<=num;i++){
if(i%2==0)
count++;
}
System.out.println("Number of even are in range:"+count);

}
}
