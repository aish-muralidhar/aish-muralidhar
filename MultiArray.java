import java.util.*;
class MultiArray
{
    public static void main(String args[])
    {
        int a[][]=new int[3][4];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the multi dimensional array elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=s.nextInt();
                /*For generating the elements randomly, we can use this random function from math class
                random function returns double so we are type casting to int data type
                int a[i][j]=(int)(Math.random() * 10);*/
            }
        }
        System.out.println("Multi Dimensional array elements are:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //Enhanced for loop to print the multidimensional array
        System.out.println("Using enhanced for loop:");
        for(int m[]: a)
        {
            for(int n:m)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}