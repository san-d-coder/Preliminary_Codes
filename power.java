import java.io.*;
class power
{
public static void main(String args[])throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("Enter the number: ");
int a=Integer.parseInt(di.readLine());
System.out.println("Enter the power: ");
int b=Integer.parseInt(di.readLine());
double c=Math.pow(a,b);
System.out.println(" "+c);
}
}
