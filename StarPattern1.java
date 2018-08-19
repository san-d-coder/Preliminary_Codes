import java.io.*;
class StarPattern1
{
void sP1()throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("Enter the number of lines: ");
int n=Integer.parseInt(di.readLine());
int i,j,k;
for(i=1;i<=n;i++)
{
for(k=1;k<=n-i;k++)
System.out.print(" ");
for(j=1;j<=2*i-1;j++)
System.out.print("*");
System.out.println("");
}
}
}