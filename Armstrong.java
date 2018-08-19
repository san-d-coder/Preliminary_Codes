import java.io.*;
class Armstrong{
void arm() throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter a number: ");
int b=Integer.parseInt(in.readLine());
int rem;
int num=0;
int n1=b;
while(n1!=0)
{
rem=n1%10;
num+=rem*rem*rem;
n1/=10;
}
if(num==b)
System.out.println(""+b+" is an Armstrong number.");
else
System.out.println(""+b+" is not an Armstrong number.");
}
}