import java.util.*;
import java.io.*;
public class ModifyMatrixByOperators{

static int [] [] modifyMatrix (int arr [] [], char operator, int key,int n) {
			int c[][]=new int[n][n];
 for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
          {

               switch(operator)
              {

                     case '+':
                    {
                       c[i][j]=arr[i][j]+key;
                       break;
                    }
                     case '-':
                    {
                       c[i][j]=arr[i][j]-key;
                       break;
                    }
                     case '*':
                    {
                       c[i][j]=arr[i][j]*key;
                       break;
                    }
                     case '/':
                    {
                       c[i][j]=arr[i][j]/key;
                       break;
                    }
                     case '%':
                    {

                   
                       c[i][j]=arr[i][j]%key;
                       break;
                    }

               }
          }
        }
        
   
        return c;



}

public static void main(String args[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter the operator");
char ch=s.next().charAt(0);
System.out.println("Enter the number");

int key=s.nextInt();
System.out.println("Enter the array size");
int n=s.nextInt();
int[][] a=new int[n][n];
System.out.println("Enter the array elements:");

for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
a[i][j]=s.nextInt();

int res[][]=modifyMatrix (a,ch,key,n);
System.out.println("The modified operation is:");

for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
System.out.print(res[i][j]+" ");
System.out.println();
}

}




}
