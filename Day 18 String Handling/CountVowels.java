import java.io.*;
import java.util.Scanner;
public class CountVowels{
void VowelCount(char chi[]){
int count=0;
for(char ch: chi)
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='A'||ch=='E'||ch=='i'||ch=='O')
count++;
System.out.print("No. of Vowels is: "+count);



}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
CountVowels obj=new CountVowels();
int n=s.nextInt();
char ch[]=new char[n];
for(int i=0;i<n;i++)
ch[i]=s.next().charAt(0);
obj.VowelCount(ch);

}
}


