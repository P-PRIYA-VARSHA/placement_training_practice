import java.util.*;
import java.io.*;
public class Reverse2DArray{

public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of rows");
int r=s.nextInt();

System.out.println("Enter the number of coulmns");
int c=s.nextInt();

int[][] arr=new int[r][c];

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
arr[i][j]=s.nextInt();
}
}
System.out.println("The array is:");

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();

}

System.out.println("The Reversed array is:");

for(int i=r-1;i>=0;i--){
for(int j=c-1;j>=0;j--){
System.out.print(arr[i][j]+" ");
}
System.out.println();

}





}
}
