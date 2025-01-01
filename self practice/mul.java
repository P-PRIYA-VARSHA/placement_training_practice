import java.util.Scanner;
import java.io.*;
class mul{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int multi=1;
for(int i=1;i<=10;i++){
multi=n*i;
System.out.println(multi);
}

}
}