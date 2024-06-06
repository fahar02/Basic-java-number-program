class Xylem_phlum
{
public static void main(String args[])
{
int number=12345;
int l1=number%10;
number/=10;
int innerSum=0;
while(number>9)
{
int l2=number%10;
innerSum+=l2;
number/=10;
}
int outerSum=l1+number;

if(outerSum==innerSum)
{
System.out.println("Xylem");
}
else
{
System.out.println("Phlum");
}

}
}