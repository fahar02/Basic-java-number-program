class SumEvenNumber
{

public static void main(String args[])
{
int number=12345;
int sumEven=0;
int count=1;
while(number>0)
{
int lastDigit=number%10;
if(count%2==0)
{
sumEven+=lastDigit;
}
number=number/10;
count++;
}
System.out.println("sum of even number"+sumEven);
}
}