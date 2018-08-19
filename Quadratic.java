import java.io.*;
class Quadratic
{ 
public void quadratic() throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("Considering the quadratic equation is in the format: a*x^2+b*x+c=0.\nEnter the values a b and c respectively");
double a=Double.parseDouble(di.readLine());
double b=Double.parseDouble(di.readLine());
double c=Double.parseDouble(di.readLine());
double x,y,d;
d=((b*b)-(4*a*c));
if(d>=0)
{
System.out.println("real roots");
x=(-b+Math.sqrt(d))/(2*a);
y=(-b-Math.sqrt(d))/(2*a);
System.out.println("ist root is:"+x+" and 2nd root is:"+y);
}
else
{
System.out.println("imaginary root");
x=1/(2*a);
y=(Math.sqrt(-1*d));
System.out.println(x+"(- "+b+"+i"+y+")");
System.out.println(x+"(- "+b+"-i"+y+")");
}
}
}