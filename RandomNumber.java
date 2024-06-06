import java.lang.*;
class RandomNumber
{
public static void main(String []args)
{
double num=Math.random();
num=num*10000;
int number=(int)num;
System.out.println(number);
int b = (int)(Math.random()*(400-200+1)+200);  
System.out.println(b); 
}
}