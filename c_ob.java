import java.io.*;
class A
{
    int a=5;
    A()
    {
        System.out.println("Inside costrut A");
    }
    void fakeIt()
    {
        System.out.println("In A");
    }


}
class B extends A
{
    int a=6;
    B()
    {
        System.out.println("Iside B's connsrtuct");
    }
    void fakeIt()
    {
        System.out.println("in B");
    }
}
class c_ob
{
    public static void main(String[]args)throws IOException
    {
        A obj=new A();
        A obj1=new B();
        obj1.fakeIt();
        obj.fakeIt();
    }
}