import java.util.Arrays;
import java.io.*;
public class ArrayInitializeSorting{
public static void main(String args[]){
int a[]=new int[]{10,33,12,54,789,12,90};
System.out.println("Before sorting array is: ");
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");
System.out.println();
System.out.println("After sorting array is: ");
Arrays.sort(a);
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");



}
}