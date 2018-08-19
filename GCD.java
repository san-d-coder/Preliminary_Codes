import java.io.*;
class Gcd
{
void gCD()throws IOException
{
int t;
DataInputStream di= new DataInputStream(System.in);
System.out.println("Enter two numbers: ");
int a=Integer.parseInt(di.readLine());
int b=Integer.parseInt(di.readLine());
do{
t=b;
b=a%b;
a=t;
}
while(b!=0);
System.out.println("The GCD of above two numbers is: "+a);
}
}