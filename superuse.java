class bike
{
    int speed=200;
}
class vechile extends bike
 {   
        int speed=300;
       void display()
       {
         System.out.println(super.speed);
         System.out.println(speed);
       }
}
class superuse
{
    public static void main(String args[])
    {
        vechile v=new vechile();
        v.display();
    }
}