public class PGStudent extends student{
String speci;

PGStudent(String name,int age,String speci)
{
super(name,age);
this.speci=speci;
}
void displaypg(){
displaystu();
System.out.println(speci);


}

}