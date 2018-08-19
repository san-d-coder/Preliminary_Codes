import java.io.*;
class KrishnaMurtiNo
{
void kmn()throws IOException
{
int i,j,s=0,k;
FactorialNo f=new FactorialNo();
DataInputStream di=new DataInputStream(System.in);
System.out.println("Enter the number: ");
i=Integer.parseInt(di.readLine());
k=i;
while(i>0)
{
j=i%10;
s=s+f.fact(j);
i=i/10;
}
if(k==s)
System.out.println(""+k+" is a Krishna Murti Number.");
else
System.out.println(""+k+" is not a Krishna Murti Number.");
}
}

