//fibonacci number with different logic
class FibonacciNumber1
{
public static void main(String []args)
{
int number=10;
int n1=0;
int n2=1;
int sum=0;
while(number>0)
{
sum=n1+n2;
n1=n2;
n2=sum;
System.out.println(n1);
number--;
}
}
}