import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                c[i][j]=sc.nextInt();
            }
        }
        //int x=0;
        int y=a-1;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==j){
                    int temp=c[i][j];
                    c[i][j]=c[x][y];
                    c[x][y]=temp;
                    x++;
                    y--;
                }
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
