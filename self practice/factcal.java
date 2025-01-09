import java.util.Scanner;

class factcal{

static int fact(int num){
int fact=1;
for(int i=1;i<=num;i++)
fact=fact*i;
return fact;


}


public static void main(String args[]){


Scanner s=new Scanner(System.in);
int num=s.nextInt();
System.out.println(fact(num));





}

}