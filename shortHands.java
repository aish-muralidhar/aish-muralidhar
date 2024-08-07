public class shortHands
{
        public static void main(String args[])
        {
                int a=10,b;
                System.out.println("Value of a:"+a);
                a+=2;
                System.out.println("Result after applying a+=2:"+a);
                a-=2;
                System.out.println("Result after applying a-=2:"+a);
                a*=2;
                System.out.println("Result after applying a*=2:"+a);
                a/=2;
                System.out.println("Result after applying a/=2:"+a);
                a%=2;
                System.out.println("Result after applying a%=2:"+a);
                b=10;
                System.out.println("Value of b:"+b);
                //Pre-Increment
                ++b;
                System.out.println("Result after applying ++b:"+b);
                //Post-Increment
                b++;
                System.out.println("Result after applying b++:"+b);
                //Decrement
                b--;
                System.out.println("Result after applying b--:"+b);
                System.out.println("Present value of b:"+b);
                int r=b++;//fetch the value and then increment
                System.out.println("Value of r(b++):"+r);
                System.out.println("Value of b after applying post increment on r:"+a);
                int s=++b;//increment and then fetch the value
                System.out.println("Value of s(++b):"+s);
                
                
        }
}