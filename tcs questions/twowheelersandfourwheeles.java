import java.io.*;
import java.util.Scanner;
class twowheelersandfourwheeles{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int v=s.nextInt();
int w=s.nextInt();
if(w<2|| w%2!=0|| v>=w)
{
System.out.println("INVALID INPUT");
return;
}
int fw=(w-2*v)/2;
int tw=v-fw;
System.out.println("two wheelers="+tw);
System.out.println("four wheelers="+fw);



}

}