class PerfectNumber
{
public static void main(String []args)
{
int number=6;
int sum=0;
for(int i=1;i<number;i++)
{
if(number%i==0)
{
sum+=i;
}
}
if(number==sum)
{
System.out.println("given number is perfect number"+number);
}
else
{
System.out.println("not a perfect number");
}
}
}