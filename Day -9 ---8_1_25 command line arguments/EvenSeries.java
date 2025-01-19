import java.io.*;
import java.util.Scanner;

public class EvenSeries{
void even(int n){
int i=1;
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
EvenSeries obj= new EvenSeries();
obj.even(num);
}
catch(NumberFormatException e){

System.out.println("Enter valid input");
}


}
}