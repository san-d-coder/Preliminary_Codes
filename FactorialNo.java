import java.io.*;
class FactorialNo
{
int fact(int a)
{
int p=1,q;
for(q=a;q>0;q--)
{
p=p*q;
}
return(p);
}
}