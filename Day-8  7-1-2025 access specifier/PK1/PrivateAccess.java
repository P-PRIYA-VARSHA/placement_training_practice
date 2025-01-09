package PK1;
import java.io.*;

class PrivateAccess{
private int b=200;

public static void main(String args[])
{ 

PrivateAccess obj=new PrivateAccess();
System.out.println(obj.b);


}
}