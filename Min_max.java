//Q.3 write a program to find the difference between maximum and minimum element of an array ? (Time complexity: O(N) )
import java.util.*;
class Min_max
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int array[]=new int[size];
for(int i=0;i<array.length;i++)
{
array[i]=sc.nextInt();
}
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<array.length;i++)
{
if(array[i]>max)
{
max=array[i];
}
if(array[i]<min)
{
min=array[i];
}
}
int difference=max-min;
System.out.println("difference between max and min is:"+difference);
}
}