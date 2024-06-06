class CheckNumberFibonacci
{
public static void main(String []args)
{
int number=5;
int i=1;
int n1=0;
int n2=1;
int sum=0;
boolean flag=false;
while(i<=number)
{
if(n1==number)
{
flag=true;
}
sum=n1+n2;
n1=n2;
n2=sum;
}
if(flag)
{
System.out.println("fibonacci number");
}
else
{
System.out.println("not a fibonacci number");
}
}
}