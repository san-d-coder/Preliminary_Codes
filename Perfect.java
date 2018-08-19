import java.io.*;
class Perfect
{
public void perfect() throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("enter a no to know the given input is perfect or not");
int a=Integer.parseInt(di.readLine());
int i,sum=0,p=a;
for(i=1;i<=a-1;i++)
{
if(a%i==0)
{
sum=sum+i;
}
}
if(sum==p)
System.out.println("no is perfect="+p);
else
System.out.println("no is not perfect="+p);
}
}