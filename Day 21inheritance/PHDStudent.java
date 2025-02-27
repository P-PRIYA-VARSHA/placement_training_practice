public class PHDStudent extends PGStudent{

String res;
PHDStudent(String name,int age,String speci,String res){
super(name,age,speci);
this.res=res;


}
void displayphd(){
displaypg();
System.out.println(res);


}



}