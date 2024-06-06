//adding the last two digits and sum until we get the original number
class Keith
{
public static void main(String []args)
{
int number=742;
int temp=number;
int n1=number%10;
number/=10;
int n2=number%10;
number/=10;
int sum=number+n1+n2;
System.out.println(sum);
int num=0;
while(num<=temp)
{
if(num==temp)
{
break;
}
num=sum+n1+n2;
System.out.println(num);
n2=n1;
n1=sum;
sum=num;
}
if(num==temp)
{
System.out.println("keith number");
}
else
{
System.out.println("not a keith number");
}
}
}