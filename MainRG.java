import java.io.*;
class MainRG
{
public static void main(String args[])throws IOException
{
DataInputStream di=new DataInputStream(System.in);
Armstrong a=new Armstrong();
DWD dw=new DWD();
EenOdd e=new EenOdd();
FactorialNo fn=new FactorialNo();
Fibo fi=new Fibo();
Gcd g=new Gcd();
KrishnaMurtiNo km=new KrishnaMurtiNo();
LeapYear l=new LeapYear();
NoSemicolon ns=new NoSemicolon();
Palindrome p=new Palindrome();
PUM pu=new PUM();
PWM pw=new PWM();
StarPattern1 sp1=new StarPattern1();
StarPattern2 sp2=new StarPattern2();
Swap3 sw=new Swap3();
QuadraticEquation qe=new QuadraticEquation();
Perfect per=new Perfect();
DivisibleBy11 db=new DivisibleBy11();
HandSome hn=new HandSome();
int x,y,z;
while(true)
{
System.out.println("\n\n1: Even Odd");
System.out.println("2: Leap Year");
System.out.println("3: Palindrome No");
System.out.println("4: Armstrong No");
System.out.println("5: Handsome No");
System.out.println("6: Krishna Murti No");
System.out.println("7: Perfect No");
System.out.println("8: Factorial No");
System.out.println("9: Fibonacci Series");
System.out.println("10: a+b without +");
System.out.println("11: a-b without -");
System.out.println("12: a*b without *");
System.out.println("13: a/b wihtout /");
System.out.println("14: a^b using Math Class");
System.out.println("15: a^b without using Math Class");
System.out.println("16: Swap using + logic");
System.out.println("17: Swap using * and / logic");
System.out.println("18: Swap using bitwise logic");
System.out.println("19: Display Name without Semicolon");
System.out.println("20: Divisibility by 11");
System.out.println("21: GCD");
System.out.println("22: Star Pattern 1");
System.out.println("23: Star Pattern 2");
System.out.println("24: Quadratic Equation");
System.out.println("25: Exit");
System.out.print("Enter your choice: ");
int n=Integer.parseInt(di.readLine());
switch(n)
{
case 1: e.eo();
break;
case 2: l.ly();
break;
case 3: p.pal();
break;
case 4: a.arm();
break;
case 5: hn.hS();
break;
case 6: km.kmn();
break;
case 7: per.perfect();
break;
case 8: System.out.println("Enter a number: ");
y=Integer.parseInt(di.readLine());
fn.fact(y);
break;
case 9: fi.fibo();
break;
case 10: System.out.println("Enter two numbers: ");
int xx=Integer.parseInt(di.readLine());
int yy=Integer.parseInt(di.readLine());
dw.add(xx,yy);
break;
case 11: System.out.println("Enter two numbers: ");
int xxx=Integer.parseInt(di.readLine());
int yyy=Integer.parseInt(di.readLine());
dw.sub(xxx,yyy);
break;
case 12: System.out.println("Enter two numbers: ");
int xxxx=Integer.parseInt(di.readLine());
int yyyy=Integer.parseInt(di.readLine());
dw.mul(xxxx,yyyy);
break;
case 13: System.out.println("Enter two numbers: ");
int x12=Integer.parseInt(di.readLine());
int y12=Integer.parseInt(di.readLine());
dw.div(x12,y12);
break;
case 14: System.out.println("Enter two numbers: ");
int x13=Integer.parseInt(di.readLine());
int y13=Integer.parseInt(di.readLine());
pu.power(x13,y13);
break;
case 15: System.out.println("Enter two numbers: ");
int x14=Integer.parseInt(di.readLine());
int y14=Integer.parseInt(di.readLine());
pw.power1(x14,y14);
break;
case 16: sw.swap1();
break;
case 17: sw.swap2();
break;
case 18: sw.swap3();
break;
case 19: ns.nS();
break;
case 20: db.dB11();
break;
case 21: g.gCD();
break;
case 22: sp1.sP1();
break;
case 23: sp2.sP2();
break;
case 24: qe.qE();
break;
case 25: System.exit(0);
break;
default: System.out.println("Wrong Input. Try again!");
}
}
}
}