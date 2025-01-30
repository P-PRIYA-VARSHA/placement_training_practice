import java.util.*;
import java.io.*;
public class MatrixMultiplication{
static int[][] multiplymatrix(int arr[][],int arr1[][],int r,int c){
System.out.println("The multiplication matrix array is:");
int[][] c1= new int[r][c];
for(int i=0;i<r;i++){
for(int j=0;j<c;j++)
for(int k=0;k<r;k++)
c1[i][j]=c1[i][j]+arr[i][k]*arr1[k][j];

}
return c1;

}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of rows");
int r=s.nextInt();

System.out.println("Enter the number of coulmns");
int c=s.nextInt();

int[][] arr=new int[r][c];
System.out.println("Enter the first array:");

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
arr[i][j]=s.nextInt();
}
}
int[][] arr1=new int[r][c];
System.out.println("Enter the second array:");

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
arr1[i][j]=s.nextInt();
}
}

System.out.println("The first array is:");

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();

}
System.out.println("The second array is:");

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(arr1[i][j]+" ");
}
System.out.println();

}

int res[][]=multiplymatrix(arr,arr1,r,c);
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(res[i][j]+" ");
}
System.out.println();
}
}
}



