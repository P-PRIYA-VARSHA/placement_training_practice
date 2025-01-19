public class ArgsToInteger{
public static void main(String args[]){

if(args.length!=1){
System.out.println("Enter a single command Line argument");
return;
}
try{
int number = Integer.parseInt(args[0]);

int sq=number*number;
System.out.println("The square of number is: "+sq);

}catch(NumberFormatException e){
System.out.println("Enter a valid input");
}
}
}