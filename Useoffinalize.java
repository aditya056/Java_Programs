//use of finalize()

class Useoffinalize
{
    public static void main(String args[])
    {
        
   String s=new String("HI");
   s=null;
   Useoffinalize obj=new Useoffinalize();
   obj=null;
   System.out.println("object going out of the scope");
   System.gc();
    }
    protected void finalize()
    {
        System.out.println("finalize method called");
    }
   
}