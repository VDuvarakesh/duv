import java.util.*;
public class Zigzag
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int temp=0;
        
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n-1;i++)
        {
          if(i%2==0 && arr[i]>arr[i+1])
          {
              temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
          }
          else if(i%2!=0 && arr[i]<arr[i+1])
          {
              temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
          }
          System.out.print(arr[i]+" ");
        }
        System.out.print(arr[n-1]);
    }
}
