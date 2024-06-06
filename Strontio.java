import java.util.*;
class Strontio
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
number=number*2;
number=number%1000;
number=number/10;
int n1=number%10;
int n2=number/10;
if(n1==n2)
{
System.out.println("given number is Strontio number");
}
else
{
System.out.println("given number is not a Strontio number");
}

}
}