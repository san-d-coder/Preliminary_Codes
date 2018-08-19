import java.io.*;
class Palindrome
{
public static void pal()throws IOException
{
int temp;
int sum=0;
int r;
DataInputStream di= new DataInputStream(System.in);
System.out.println("Enter the number: ");
int num=Integer.parseInt(di.readLine());
temp=num;
while(num!=0)
{
r=num%10;
num=num/10;
sum=sum*10+r;
}
if(sum==temp)
System.out.println("Number is palindrome.");
else
System.out.println("Number is not palindrome");
}
}
