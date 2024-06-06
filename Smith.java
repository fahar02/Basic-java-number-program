import java.util.*;
public class Smith {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int temp=number;
	int sum1=0;
	int sum2=0;
	while(number>0)
	{
	int rem=number%10;
	sum1=sum1+rem;
	number=number/10;
	}
	System.out.println(sum1);
	for(int i=2;i<=temp;i++)
	{
	if(temp%i==0)
	{
		System.out.println(i);
	int count=0;
	for(int j=1;j<=i;j++)
	{
	if(i%j==0)
	{
	count++;
	}
	}
	if(count==2)
	{
	int numb=i;
	while(numb>0)
	{
	int rem=numb%10;
	System.out.println(rem);
	sum2=sum2+rem;
	numb=numb/10;
	}
	}
	}
	}
	System.out.println(sum2);
	if(sum1==sum2)
	{
	System.out.println("given number is smith number");
	}
	else
	{
	System.out.println("given number is not a smith number");
	}
	}

}