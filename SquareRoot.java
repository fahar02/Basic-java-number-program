class SquareRoot
{
public static void main(String args[])
{
int number=81;
boolean flag=false;
for(int i=1;i<number/2;i++)
{
if(i*i==number)
{
System.out.print(i);
flag=true;
}
}
if(flag)
{
System.out.println("  is Square root of a given number");
}
else
{
System.out.println("given number is not having root ");
}
}
}