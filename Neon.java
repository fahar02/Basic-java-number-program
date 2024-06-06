//square of given number and sum of each digit is equal to given number
class Neon
{
public static void main(String []args)
{
int number=9;
int square=number*number;
int sum=0;
while(square>0)
{
int lastDigit=square%10;
sum+=lastDigit;
square=square/10;
}
if(number==sum)
{
System.out.println("given number is neon number");
}
else
{
System.out.println("given number is not neon number");
}
}
}