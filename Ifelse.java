//Pgm to find greatest of three nos using if-else condition
class Ifelse
{
    public static void main(String args[])
    {
        int x=8,y=1,z=14;
        if(x>y)
        {
            if(x>z)
                System.out.println(x);
            else
                System.out.println(z);
        }
        else
        {
            if(y>z)
                System.out.println(y);
            else
                System.out.println(z);
        }
    }
}