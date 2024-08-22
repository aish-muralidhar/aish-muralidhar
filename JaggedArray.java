//JaggedArray is a multidimensional array with fixed number of rows, but number of columns are not fixed
import java.util.*;
class JaggedArray
{
    public static void main(String args[])
    {
        //Required only if we are reading input from user
        Scanner s=new Scanner(System.in);
        int nums[][]=new int[3][];
        nums[0]=new int[3];
        nums[1]=new int[2];
        nums[2]=new int[4];
        //System.out.println("Enter Array elements:");
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {

                //nums[i][j]=s.nextInt();
                //Using the random method from math class to generate random values
                nums[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing the array using enhanced for loop:");
        for(int n[]:nums)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}