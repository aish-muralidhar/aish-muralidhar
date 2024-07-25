class Datatypes
{
    public static void main(String args[])
    {
        int n=999888;
        System.out.println("Integer variable:"+ n);
        long l=5854l;
        System.out.println("Long variable:"+l);
        short s=338;
        System.out.println("Short variable:"+s);
        byte b=12;
        System.out.println("Byte variable:"+b); 
        boolean bo=true;
        System.out.println("Boolean variable:"+bo);
        char c='8';
        System.out.println("Character variable:"+c);
        float f=5.8f;
        System.out.println("Float variable:"+f);
        byte a=12;
        int d;
        //Type conversion(Implicit Conversion)
        d=a;
        System.out.println("Result after Type conversion(Implicit conversion):"+d);
        int m=256;
        //Type Casting(Expicit Conversion)
        a=(byte)m;
        System.out.println("Result after Type casting(Explicit conversion):"+a);
        byte p=12;
        byte o=14;
        //Type promotion
        int r=p*o;
        System.out.println("Result after Type promotion:"+r);

    }
}