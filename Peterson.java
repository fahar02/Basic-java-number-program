//A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
class peterson
{
static int fact[]={1,1,2,6,24,120,720,5040,40320,362880, 3628800};
public static void main(String args[])
{
int number=145;
int tem=number;
int sum=0;
while(number>0)
{
int lastDigit=number%10;
sum+=fact[lastDigit];
number=number/10;
}
if(tem==sum)
{
System.out.println("peterson number");
}
else
{
System.out.println("not a peterson number");
}
}
}