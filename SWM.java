import java.io.*;
class SWM extends AWP
{
int x,y,i;
public void sub(int a,int b)
{
x=a;
y=b;
for(i=b;i>0;i--)
{
x--;
}
System.out.println("The difference of "+a+" and "+b+" is "+x);
}
}
