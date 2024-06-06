class ISBN
{
public static void main(String args[])
{
double number=2345678911;
int count=0;
double temp=number;
while(number>0)
{
number=number/10;
count++;
}
if(count==10)
{
System.out.println("number is valid for isbn number");
int mul=1;
int sum=0;
while(temp>0)
{
int no=temp%10;
no=no*mul;
sum=sum+no;
mul++;
temp=temp/10;
}
if(sum%11==0)
{
System.out.println("isbn number");
}
else
{
System.out.println("not isbn number");
}
}
else
{
System.out.println("number is not a isbn number");
}
}
}