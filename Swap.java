import java.io.*;
class Swap1
{
public void swap1() throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("enter two no for swaping");
int a=Integer.parseInt(di.readLine());
int b=Integer.parseInt(di.readLine());
a=a+b;
b=a-b;
a=a-b;
System.out.println("Swep of"+a+"and"+b+"is="+a+"   "   +b);
}
}
class Swap2 extends Swap1
{
public void swap2() throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("enter two no swaping method 2");
int a=Integer.parseInt(di.readLine());
int b=Integer.parseInt(di.readLine());
a=a*b;
b=a/b;
a=a/b;
System.out.println("Swep of two no is="+a+"   "  +b);
}
}
class Swap3 extends Swap2
{
public void swap3() throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("enter two no for swaping method 3");
int a=Integer.parseInt(di.readLine());
int b=Integer.parseInt(di.readLine());
a=a^b;
b=a^b;
a=a^b;
System.out.println("after swaping two no is:"+a+"  "+b);
}
}