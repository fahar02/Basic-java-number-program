//calculate the factorial of each digit
class FactorialOfDigit
{

public static void main(String args[])
{
int number=12345;
while(number>0)
{
int fact=1;
int rem=number%10;
while(rem>0)
{
fact=fact*rem;
rem--;
}
System.out.println(fact);
number=number/10;
}
}
}