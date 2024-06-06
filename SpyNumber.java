class SpyNumber
{
public static void main(String []args)
{
int number=123;
int sum=0;
int product=1;
while(number>0)
{
int lastDigit=number%10;
sum+=lastDigit;
product*=lastDigit;
number=number/10;
}

if(sum==product)
{
System.out.println("Spy number");
}
else
{
System.out.println("not a spyNumber");
}
}
}