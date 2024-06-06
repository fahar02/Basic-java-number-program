class SumFactorialDigit
{
public static void main(String args[])
{
int number=12345;
int sum=0;
while(number>0)
{
int fact=1;
int rem=number%10;
while(rem>0)
{
fact=fact*rem;
rem--;
}
sum=sum+fact;
number=number/10;
}
System.out.println(sum);
}
}