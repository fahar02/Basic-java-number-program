class TechNumber
{
public static void main(String []args)
{
int number=2025;
int sum=0;
int temp=number;
int no=number;
int count=0;
while(number>0)
{
number=number/10;
count++;
}
if(count%2==0)
{
System.out.println("given number is having even digits");
count=count/2;
int power=1;
while(count>0)
{
power*=10;
count--;
}
int lastDigit=temp%power;
temp=temp/power;
sum=lastDigit+temp;
int square=sum*sum;
if(square==no)
{
System.out.println("tech number");
}
else
{
System.out.println("not a tech number");
}
}
else
{
System.out.println("given number is having odd digits");
}
}
}