import java.io.*;
import java.util.*;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num<1){
            System.out.println("invalid input");
            return ;
        }
         TreeSet<Integer> x1=new TreeSet<>();
        for(int i=0;i<num;i++)
            x1.add(s.nextInt());
        
            
         int num1=s.nextInt();
        if(num1<2){
            System.out.println("invalid input");
            return ;
}
        
        TreeSet<Integer> x2=new TreeSet<>();
        for(int i=0;i<num1;i++)
            x2.add(s.nextInt());
        
        if(num==num1){
            System.out.println("No number is missing");
        return;
        }
        TreeSet<Integer> x3=new TreeSet<>(x2);
        x3.removeAll(x1);

         if (x3.isEmpty()) {
            System.out.println("No number is missing");
        } else {
            for (int n : x3) {
                System.out.print(n + " ");
            }
         }
      
    
            
    }
}