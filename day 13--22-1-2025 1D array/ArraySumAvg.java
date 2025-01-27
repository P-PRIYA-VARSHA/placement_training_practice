import java.util.Arrays;
public class ArraySumAvg{
public static void main(String args[]){
int arr[]=new int[]{1,2,3,4,5};
System.out.println("sum of array:");
int sum=0;
for(int i=0;i<arr.length;i++)
{ sum=sum+arr[i];
}
System.out.println(sum);
System.out.println("average of array:");
int avg=sum/arr.length;
System.out.println(avg);

}
}