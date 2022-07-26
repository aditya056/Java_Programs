interface a
{
    void func1();
}
interface b extends a
{
    void func2();
}
class c implements b
{
    public void func1()
    {
        System.out.println("THIS IS A ");
    }
    public void func2()
    {
        System.out.println("THIS IS B");
    }
}

class extend
{
    public static void main(String args[])
    {
        c C=new c();
        C.func1();
        C.func2();
    }
}
