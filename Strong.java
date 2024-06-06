class Strong
{
public static void main(String args[])
{
int number=145;
int temp=number;
int sumFact=0;
while(number>0)
{
int lastDigit=number%10;
int factorial=1;
while(lastDigit>0)
{
factorial*=lastDigit;
lastDigit--;
}
sumFact+=factorial;
number=number/10;
}
if(temp==sumFact)
{
System.out.println("Strong number"+temp);
}
else
{
System.out.println("not a Strong number");
}
}
}