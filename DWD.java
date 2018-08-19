class DWD extends MWI
{
int x,y,i;
public void div(int a,int b)
{
x=a;
y=b;
while(x>=y)
{
x=x-y;
i++;
}
System.out.println("Division of "+a+" and "+b+" has qoutient: "+i+"and remainder : "+x);
}
}
