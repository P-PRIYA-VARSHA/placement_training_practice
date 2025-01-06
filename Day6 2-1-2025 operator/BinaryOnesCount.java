import java.util.Scanner;
class BinaryOnesCount{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
String binstr=Integer.toBinaryString(num);
int count=0;
for(int i=0;i<binstr.length();i++){
if(binstr.charAt(i)=='1')
count++;
}
System.out.println(count);



}
}