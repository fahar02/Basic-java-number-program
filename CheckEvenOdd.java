//check the given number is odd or even 
class CheckEvenOdd
{
public static void main(String []args)
{
int number=23;
int last=0;
while(number>0)
{
last=number%10;
number=number/10;
}
if(last%2==0)
{
System.out.println("even number");
}
else
{
System.out.println("odd number");
}
}
}