import java.util.TreeSet; //without import it will show index out of bound
import java.util.Arrays;
class  RemoveDuplicateElement
{
public static void main(String[] args)
{
int[] a=new int[]{1,23,1,34,1,2,23,5,4,100};
TreeSet<Integer> x = new TreeSet<>();

for(int i=0;i<a.length;i++)
{
x.add(a[i]);
}
for(int num:x)
{
System.out.print(num+" ");
}
}
}