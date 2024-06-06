class FibonacciNumber
{
public static void main(String []args)
{
int number=8;
int x=0;
int y=1;
int sum=0;
while(number>1)
{
System.out.println(y);
sum=x+y;
x=y;
y=sum;
number--;
}
}
}