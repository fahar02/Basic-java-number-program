//sunny number is those number whose next number is perfect Square
class Sunny
{
public static void main(String args[])
{
int n=7;
int n1=n+1;
boolean flag=false;
for(int i=1;i<n1/2;i++)
{
if(i*i==n1)
{
flag=true;
break;
}
}
if(flag)
{
System.out.println("Sunny number");
}
else
{
System.out.println("not aSunny number"); 
}
}
}