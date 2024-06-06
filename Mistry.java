// mistry number xy+yx==number 
import java.util.*;
class Mistry
{
public static int reverse(int j)
{
int rev=0;
while(j>0)
{
int rem=j%10;
rev=rev*10+rem;
j=j/10;
}
return rev;
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
boolean flag=false;
for(int i=0;i<=number/2;i++)
{
int j=reverse(i);
if(i+j==number)
{
flag=true;
break;
}

}
if(flag)
{
System.out.println("mistry number");
}
else
{
System.out.println("not a mistry number");
}
}
}