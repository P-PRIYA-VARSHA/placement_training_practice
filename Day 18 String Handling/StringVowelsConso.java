import java.io.*;
import java.util.Scanner;
public class StringVowelsConso{
void VowelCount(char chi[]){
int count=0;
int conso=0;
for(char ch: chi)
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u'||ch=='U')
count++;
else
conso++;

System.out.print("No. of Vowels is: "+count);

System.out.print("No. of consonants is: "+conso);


}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
StringVowelsConso obj=new StringVowelsConso();

String str=s.next();
obj.VowelCount(str.toCharArray());

}
}


