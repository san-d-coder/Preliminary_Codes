import java.io.*;
class Fibo
{
int a,b,c,i;
void fibo()throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("Enter the number: ");
int k=Integer.parseInt(di.readLine());
int a=0;
int b=1;
c=k;
System.out.println("Fibonacci Series upto "+k+" is displayed below: ");
System.out.println(": "+a);
System.out.println(": "+b);
for(i=2;i<=c;i++)
{
int s=a+b;
System.out.println(": "+s);
a=b;
b=s;
}
}
}
