class add
{
    int x,y;
    add(int a,int b)
    {
        x=a;
        y=b;
    }
    void sum(add a1)
    {
        int sum1=a1.x+a1.y;
        System.out.println("the sum is said to be"+sum1);
    }
}

class poap
{
    public static void main(String args[])
    {
        add a2=new add(10,20);
        a2.sum(a2);
    }
}