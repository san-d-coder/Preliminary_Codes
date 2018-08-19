import java.io.*;

//Sum without plus, Subtraction without minus, Product without into, Division without by
class Abc
{
int x,y,i;
public void add(int a,int b)
{
x=a;
y=b;
for(i=0;i<b;i++)
{
x++;
}
System.out.println("The sum of "+a+" and "+b+" is "+x);
}
}
class Bbc extends Abc
{
int x,y,i;
public void sub(int a,int b)
{
x=a;
y=b;
for(i=b;i>0;i--)
{
x--;
}
System.out.println("The difference of "+a+" and "+b+" is "+x);
}
}
class Cbc extends Bbc
{
int x,y,i,s=0;
public void mul(int a,int b)
{
x=a;
y=b;
for(i=0;i<b;i++)
{
s=s+x;
}
System.out.println("The product of "+a+" and "+b+" is "+s);
}
}
class Dbc extends Cbc
{
int x,y,i;
public void div(int a,int b)
{
x=a;
y=b;
while(x>=y)
{
x=x-y;
i++;
}
System.out.println("Division of "+a+" and "+b+" has qoutient: "+i+"and remainder : "+x);
}
}

class MainSG
{
public static void main(String args[])throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("Enter two numbers: ");
int a=Integer.parseInt(di.readLine());
int b=Integer.parseInt(di.readLine());
Dbc d=new Dbc();
d.add(a,b);
d.sub(a,b);
d.mul(a,b);
d.div(a,b);
}
}