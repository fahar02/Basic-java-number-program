class Palindrome
{
public static void main(String args[])
{
int number=1221;
int temp=number;
int reverse=0;
while(number>0)
{
int lastDigit=number%10;
reverse=reverse*10+lastDigit;
number=number/10;
}

if(temp==reverse)
{
System.out.println("given number is palindrome");
}
else
{
System.out.println("given number is not palindrome");
}
}
}