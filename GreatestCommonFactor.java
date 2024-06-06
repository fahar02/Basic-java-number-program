class GreatestCommonFactor
{

public static void main(String []args)
{
int n1=20;
int n2=40;
int gcf=0;
for(int i=1;i<=n1;i++)
{
if(i<=n2)
{
if(n1%i==0 && n2%i==0)
{
gcf=i;
}
}
}
System.out.println("greatest Common factor"+gcf);
}
}