import java.util.*;

public class NthPrime {
static boolean isPrime(int num){

if(num<2)
return false;
for(int i=2;i*i<=num;i++){
if(num%i==0)
return false;
}
return true;
}

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();       
  int count = 0, num = 1;
while(count<n){
num++;
if(isPrime(num))
count++;               
    }
System.out.print(num);
}

}
