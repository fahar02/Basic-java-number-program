//given number is and the square of last number is equal i.e 5=25 5==5
class Automorphic 
{
public static void main(String []args)
{
int n=5;
int n1=n*n;
int count=1;
while(n1>9)
{
n1=n1/10;
count=count*10;
}
int No=(n*n)%count;
if(n==No)
{
System.out.println("automorphic number");
}
else
{
System.out.println("not a automorphic number");
}
}
}