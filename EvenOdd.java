import java.io.*;
class EenOdd
{
void eo()throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("Enter the number: ");
int i=Integer.parseInt(di.readLine());
if(i%2==0)
System.out.println(i+" is an even number");
else
System.out.println(i+" is an odd number");
}
}