import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            num=(-num);
            System.out.print("-");
        }
        String st="";
        while(num>0){
            int temp=num%10;
            num=num/10;
            st=st+temp;
        }
       
        int d=Integer.parseInt(st);
        System.out.println(d);
     }
}
