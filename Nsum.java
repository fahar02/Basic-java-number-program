//Q.7 print the sum of n natural number using recursion?
import java.util.*;
class Nsum
{
public static int sum(int number)
{
int N=0;
while(number>0)
{
N=N+number;
sum(--number);
}
return N;
}
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println(sum(number));

}
}