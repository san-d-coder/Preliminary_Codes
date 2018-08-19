class MWI extends SWM
{
int x,y,i,s=0;
public void mul(int a,int b)
{
x=a;
y=b;
for(i=0;i<b;i++)
{
s=s+x;
}
System.out.println("The product of "+a+" and "+b+" is "+s);
}
}
