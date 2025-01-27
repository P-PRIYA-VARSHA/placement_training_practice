public class ArrayDecl{
public static void main(String args[]){

int[] a= new int[5];
for(int i=0;i<a.length;i++){
a[i]=i+1;
System.out.println(a[i]+" ");
}
int max=a[0];
for(int i=0;i<5;i++){
if(max<a[i])
max=a[i];

}
System.out.println("Maximum value is :"+max);
int min=a[0];
for(int i=0;i<a.length;i++){
if(min>a[i])
min=a[i];
}
System.out.println("Minimum value is :"+min);
}
}