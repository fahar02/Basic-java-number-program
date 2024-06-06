class PrimeNumberRange
{
public static void main(String args[])
{
int start=100;
int end=999;
for(int i=start;i<=999;i++)
{
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
System.out.println(i);
}

}
}
}