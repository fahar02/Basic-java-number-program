class SumNumber
{

public static void main(String args[])
{
int number=12345;
int sum=0;
while(number>0)
{
int lastDigit=number%10;
sum=sum+lastDigit;
number=number/10;
}
System.out.println("sum of number is:"+sum);
}
}