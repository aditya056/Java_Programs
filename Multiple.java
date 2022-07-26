interface Siddhartha
{
    void show1();
    public default void show2()
    {
        System.out.println("this is default method");
    }
}

interface APSCHE
{
    void show1();
    public default void show2()
    {
        System.out.println("this is default method");
    }
}

class pvp implements Siddhartha,APSCHE
{
    public void show1()
    {
        System.out.println("THIS IS PVPSIT");
    }
    public void show2()
    {
        System.out.println("this is my intrest");
    }
}
class vrsec implements Siddhartha
{
    public void show1()
    {
        System.out.println("THIS IS VRSEC");
    }
    public void show2()
    {
        System.out.println("this is my intrest");
    }
}

class Multiple
{
    public static void main(String args[])
    {
        pvp p=new pvp();
        p.show1();
        p.show2();
        vrsec v=new vrsec();
        v.show1();
        v.show2();
    }
}    
  