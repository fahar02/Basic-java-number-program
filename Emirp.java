class Emirp
{
public static boolean check(int number)
{
int count=0;
for(int i=1;i<=number;i++)
{
if(number%i==0)
{
count++;
}
}
if(count==2)
{
return true;
}
else
{
return false;
}
}
public static void main(String args[])
{
int number=199;
int reverse=0;
if(check(number))
{
while(number>0)
{
int rem=number%10;
reverse=reverse*10+rem;
number=number/10;
}
if(check(reverse))
{
System.out.println("number is Emirp");
}
else
{
System.out.println("number is not a Emirp");
}
}
else
{
System.out.println("given number is not a number");
}
}
}