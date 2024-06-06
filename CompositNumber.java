class CompositNumber
{
public static void main(String args[])
{
int number=5;
int count=0;
for(int i=1;i<=4;i++)
{
if(number%i==0)
{
count++;
}
}
if(count>2)
{
System.out.println("composit number"+number);
}
else
{
System.out.println("not a composit number");
}
}
}