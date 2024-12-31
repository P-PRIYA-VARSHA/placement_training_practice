//WASHING MACHINE
import java.io.*;
import java.util.*;
class washing{

static void fun(int wt,char level){

if(wt>=7000)
System.out.println("OVERLOADED");
else if(wt<0)
System.out.println("INVALID INPUT");

int esttime=0;
if (wt==0)
 esttime=0;
else if(wt<=2000 && wt>0&&( level=='L'||level=='L'))
esttime=25;
else if (wt<=4000 && 2001<=wt && (level=='M'||level=='m'))
 esttime=35;
else if(wt>4000 && wt<7000 && (level=='h'||level=='H'))
 esttime=45;
if(wt>=0&&wt<7000)
System.out.println("Time Estimated: "+esttime+" minutes");

}
public static void main(String args[]){

Scanner s=new Scanner(System.in);
int wt=s.nextInt();
char level=s.next().charAt(0);
fun(wt,level);
}
}
