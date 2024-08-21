class Calculator
{
    //Method overloading of add() method
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n1,int n2)
    {
        return n1+n2;
    }
}
class MethodOverloadingDemo
{
    public static void main(String args[])
    {
        Calculator c= new Calculator();
        int r=c.add(4,2);
        System.out.println("Sum of 2 integers is "+r);
        int r1=c.add(4,3,2);
        System.out.println("Sum of 3 integers is "+r1);
        double r2=c.add(4.5,3);
        System.out.println("Sum of a double and an integer is "+r2);
    }
}