import java.io.*;
class DivisibleBy11
{
void dB11()throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.print("Enter the number: ");
int x=Integer.parseInt(di.readLine());
int y=x;
int i=0;
int a[]=new int[100];
while(x!=0)
{
int r=x%10;
a[i]=r;
i++;
x=x/10;
}
int j=i;
int k=0;
int esum=0;
int osum=0;
while(i>=0)
{
esum=esum+a[2*k];
i--;
k++;
}
int l=0;
while(j>=0)
{
osum=osum+a[2*l+1];
j--;
l++;
}
if((esum==osum)||(esum+osum==11))
System.out.println(y+" is divisible by 11.");
else
System.out.println(y+" is not divisible by 11");
}
}
