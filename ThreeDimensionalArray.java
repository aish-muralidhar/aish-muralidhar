import java.util.*;
class ThreeDimensionalArray
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int nums[][][]=new int[3][4][5];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    nums[i][j][k]=(int)(Math.random()*10);
                }
            }
        }
        System.out.println("Enter three dimensional array elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    nums[i][j][k]=s.nextInt();
                }
            }
        }
        System.out.println("The Three dimensional array elements made from user input:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.print(nums[i][j][k]+" ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("The Three dimensional array elements generated using random method are:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.print(nums[i][j][k]+" ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("Printing the Three-dimensional array using enhanced for loop:");
        for(int n[][]:nums)
        {
            for(int m[]:n)
            {
                for(int a:m)
                {
                    System.out.print(a+" ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}