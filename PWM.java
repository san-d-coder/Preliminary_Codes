import java.io.*;
class PWM
{
int x,y,p=1,i;
public void power1(int a,int b)
{
x=a;
y=b;
for(i=0;i<b;i++)
{
p=p*x;
}
System.out.println(""+x+"^"+y+" is: "+p);
}
}
