import java.util.Scanner;
class Calculator
{
    public int add(int a,int b)
    {
        int r=a+b;
        return r;
    }
}

class newclass
{
    public static void main(String args[])
    {
        int num1,num2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1=s.nextInt();
        num2=s.nextInt();
        Calculator calc=new Calculator();
        int result=calc.add(num1,num2);
        System.out.println("Sum is "+result);
    }
}