import java.util.*;
class CopyArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int array[]=new int[size];
for(int i=0;i<size;i++)
{
array[i]=sc.nextInt();
}
int dum[]=new int[size];
for(int i=0;i<size;i++)
{
dum[i]=array[i];
}
System.out.println("original array");
for(int i=0;i<size;i++)
{
System.out.println(array[i]);
}
System.out.println("dummy array");
for(int i=0;i<size;i++)
{
System.out.println(dum[i]);
}
}
}