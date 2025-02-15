import java.io.*;
import java.util.*;
public class PrintUniqueConso{
int CharConsoCount(char arr[]){
HashSet<Character> x=new HashSet<>();
for(char c:arr){
if(c!='A'&& c!='E'&& c!='I'&& c!='O'&& c!='U'&& c!='a'&&c!='e'&& c!='i'&& c!='o' && c!='u')
x.add(c);
}
return x.size();


}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
PrintUniqueConso obj=new PrintUniqueConso();
int n=s.nextInt();
char ch[]=new char[n];
for(int i=0;i<n;i++)
ch[i]=s.next().charAt(0);
System.out.println(obj.CharConsoCount(ch));


}

}

