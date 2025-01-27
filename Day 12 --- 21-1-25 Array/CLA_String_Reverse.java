import java.util.*;
import java.io.*;
public class CLA_String_Reverse{
public static void main(String args[]){
String s=args[0]+" "+args[1];
/*if (args.length == 0) {
            System.out.println("Error: Please provide a string as a command-line argument.");
            return; // Exit if no argument is provided
        }*/
for(int i=s.length()-1;i>=0;i--){
System.out.print(s.charAt(i));
}



}
}