class forloop
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            if(i==1)
                System.out.println("DAY "+i+" - Monday");
            else if(i==2)
                System.out.println("DAY "+i+" - Tuesday");
            else if(i==3)
                System.out.println("DAY "+i+" - Wednesday");
            else if(i==4)
                System.out.println("DAY "+i+" - Thursday");
            else if(i==5)
                System.out.println("DAY "+i+" - Friday");
            for(int j=9;j<=18;j++)
            {
                if(j<12)
                    System.out.print(j+"AM ");
                else if(j==12)
                    System.out.print(j+"PM ");
                else if(j>12)
                    System.out.print(j-12+"PM ");
   
            }
            System.out.println(); 
            System.out.println(); 

        }
    }
}