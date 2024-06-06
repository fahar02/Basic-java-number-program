class Happy_Sad
{
public static void main(String args[])
{
for(int i=1;i<=10;i++)
{
int number=i;
while(true)
{
int sum=0;
while(number>0)
{
int ld=number%10;
int square=ld*ld;
sum+=square;
number=number/10;
}

if(sum==1)
{
System.out.println("Happy number");
break;
}
else if(sum==4)
{
System.out.println("sad number");
break;
}
else
{
number=sum;
}

}
}
}
}