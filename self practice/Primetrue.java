import java.util.Scanner;
class PrimeTrue{

static boolean prime(int num){
int count=0;
for(int i=1;i<=num;i++){
if(num%i==0)
count++;
}
if(count==2)
return true;
else
return false;



}

public static void main(String args[]){

Scanner s=new Scanner(System.in);
int num=s.nextInt();
System.out.println(prime(num));
}

}
