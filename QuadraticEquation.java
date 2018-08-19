import java.io.*;
class QuadraticEquation
{
void qE()throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("Consider the Quadratic equation is in the form of a*x^2+b*x+c");
System.out.print("Enter the value of a: ");
double a=Double.parseDouble(di.readLine());
System.out.print("\nEnter the value of b: ");
double b=Double.parseDouble(di.readLine());
System.out.print("\nEnter the value of c: ");
double c=Double.parseDouble(di.readLine());
Double d=Math.pow(b,2)-4*a*c;
if(d>0)
{
System.out.println("This quadratic equation has real and distinct roots");
double r1=((-1*b+Math.sqrt(d))/2*a);
double r2=((-1*b-Math.sqrt(d))/2*a);
System.out.println("Roots are:"+r1+" and "+r2);
}
else
{
if(d==0)
{
System.out.println("This quadratic equation has two real and same roots");
double r3=(-1*b)/2*a;
System.out.println("Roots are: "+r3+" & "+r3);
}
else
{
if(d<0)
{
System.out.println("This quadratic equation has complex conjugate roots.");
double d2=4*a*c-Math.pow(b,2);
double d1=Math.sqrt(d2);
double r4=(-1*b)/(2*a);
double r5=d1/2*a;
System.out.println("The roots are: "+r4+"+"+r5+"i and "+r4+"-"+r5+"i");
}
}
}
}
}

