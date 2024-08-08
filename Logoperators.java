class Logoperators
{
    public static void main(String args[])
    {
        int x=5,y=9;
        int a=5,b=4;
        //AND operator
        boolean r= x>y && a>b;
        System.out.println(r);
        //OR operator
        boolean s=x>y || a>b;
        System.out.println(s);
        //NOT operator
        System.out.println(!s);

    }
}