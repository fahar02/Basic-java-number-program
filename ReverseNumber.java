//reverse the number
class ReverseNumber
{

public static void main(String []args)
{
int number=1234;
int sum=0;
int revese=0;
while(number>0)
{
int rem=number%10;
sum=revese*10;
revese=sum+rem;
number=number/10;
}
System.out.println(revese);
}
}