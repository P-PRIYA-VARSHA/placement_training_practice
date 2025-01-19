import java.io.*;
import java.util.Scanner;

public class OddSeries{
void odd(int n){
int i=0;
while(n>0){
System.out.print(i+1+" ");
i=i+2;
n--;
}
}
public static void main(String args[]){
if(args.length!=1){
System.out.println("Enter single number");
return ;}
try{

int num=Integer.parseInt(args[0]);
OddSeries obj= new OddSeries();
obj.odd(num);
}
catch(NumberFormatException e){

System.out.println("Enter valid input");
}


}
}