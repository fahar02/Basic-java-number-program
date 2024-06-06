class SumOddNumber
{
public static void main(String []args)
{
int number=12345;
int sumOdd=0;
int count=1;
while(number>0)
{
int lastDigit=number%10;
if(count%2==1)
{
sumOdd+=lastDigit;
}
number=number/10;
count++;
}
System.out.println("sum of odd digits"+sumOdd);
}
}