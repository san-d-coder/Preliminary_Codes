import java.io.*;
class HandSome
{
void hS()throws IOException
{
DataInputStream di=new DataInputStream(System.in);
FactorialNo f=new FactorialNo();
System.out.println("Enter the number: ");
int x=Integer.parseInt(di.readLine());
int y=x;
int s=0;
int r=x%10;
x=x/10;
while(x>0)
{
int r1=x%10;
s=s+r1;
x=x/10;
}
if(s==r)
System.out.println(y+" is a Handsome number.");
else
System.out.println(y+" is not a Handsome number.");
}
}

