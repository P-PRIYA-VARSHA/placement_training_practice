import java.util.Scanner;
public class MultiDimensionalArray_greatestnu{
public static void main(String args[]){
int arr[][]=new int[3][3];
int count=0;
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
arr[i][j]=Integer.parseInt(args[count]);
count++;
}
}


int temp=arr[0][0];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
if(temp<arr[i][j])
temp=arr[i][j];
}
}
System.out.println("the greatest number is: "+temp);
}
}






