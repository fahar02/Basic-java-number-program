class Factorial
{
public static void main(String args[])
{
int number=5;
int factorial=1;
while(number>0)
{
factorial*=number;
number--;
}
System.out.println("factorial for given number:"+factorial);
}
}