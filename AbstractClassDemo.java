abstract class Abc
{
public void show()
{
System.out.println("This is a concrete method in the abstract class");
}
abstract void display(int x);
}
class Bbc extends Abc
{
void display(int x)
{
System.out.println(""+Math.pow(x,2));
}
}
class Cbc extends Abc
{
void display(int x)
{
System.out.println(""+Math.sqrt(x));
}
}
class Dbc
{
public static void main(String args[])
{
Bbc a1=new Bbc();
Cbc a2=new Cbc();
a1.display(2);
a2.display(4);
a2.show();
}
}