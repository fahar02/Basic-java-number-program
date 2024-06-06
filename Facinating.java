class Facinating
{

public static void main(String args[])
{
int number=327;
int n1=number*2;
int n2=number*3;
boolean flag=true;
String no=number+""+n1+n2; 
System.out.println(no);
for(char i='1';i<='9';i++)
{
int count=0;
for(int j=0;j<no.length();j++)
{
if(i==no.charAt(j))
{
count++;
}

}
if(count>2 || count==0)
{
flag=false;
break;
}

}

if(!flag)
{
System.out.println("given number is not facinating ");
}
else
{
System.out.println("given number is facinating");
}
}
}