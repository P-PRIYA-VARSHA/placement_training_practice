import java.io.*;
class WithoutConstructorWithargument
{
void display(String vtu,String name){
System.out.println(vtu+" "+name);

}
public static void main(String args[]){
WithoutConstructorWithargument obj=new WithoutConstructorWithargument();

obj.display("VTU22013","PRIYA");
}
}