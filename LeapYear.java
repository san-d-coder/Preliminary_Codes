import java.io.*;
class LeapYear
{
 void ly()throws IOException
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("Enter the year: ");
double c=Double.parseDouble(di.readLine());
if((c%4==0&&c%100!=0)||(c%400==0))
System.out.println(""+c+" is a Leap Year.");
else
System.out.println(""+c+" is not a Leap Year.");
}
}