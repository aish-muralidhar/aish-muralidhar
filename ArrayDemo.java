import java.util.*;
class ArrayDemo
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 10 elements:");
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }    
        System.out.println("The array elements are:");
        for(int i=0;i<10;i++)
        System.out.print(a[i]+" ");
    }
}