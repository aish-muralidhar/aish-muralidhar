class Computer
{
    public void playMusic()
    {
        System.out.println("Playing music");
    }
    public String getMeAPen(int cost)
    {
        if(cost>=10)
            return ("I got a pen of cost "+cost);
        else 
            return "Pen can't be given at a cost less than 10 rupees";
    }
}
class MethodDemo
{
    public static void main(String args[])
    {
        Computer ob=new Computer();
        ob.playMusic();
        int b=10;
        String a=ob.getMeAPen(b);
        System.out.println(a);
    }
}