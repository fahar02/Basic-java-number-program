class Armstromg
{
public static void main(String []args)
{
int number=676;
int temp=number;
int sum=0;
while(number>0)
{
int lastDigit=number%10;
int cube=lastDigit*lastDigit*lastDigit;
sum+=cube;
number=number/10;
}
if(temp==sum)
{
System.out.println("given number is prime number"+temp);
}
else
{
System.out.println("given number is not a prime number"+temp);
}
}
}