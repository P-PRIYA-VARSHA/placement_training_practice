public class Box{

int height;
int width;
int depth;
public Box(int i,int j,int k){
this.height=i;
this.width=j;
this.depth=k;
}
int volume(){
return height*width*depth;
}
}