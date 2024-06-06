//Q.5 write a code to find all the duplicate element of an array ?
import java.util.*;
class ArrayD
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
boolean flag=false;
int unique[]	=new int[size];
int counted=0;
for(int i=0;i<array.length;i++)
{
flag=false;
for(int j=0;i<unique.length;j++)
{
if(array[i]==unique[j])
{
flag=true;
}
}
if(flag)
{
continue;
}
int count=0;
for(int k=0;k<array.length;k++)
{
if(array[i]==array[k])
{
count++;
}
}
if(count>2)
{
System.out.println("find a duplicate"+array[i]);
}
unique[counted]=array[i];
counted++;





}




}

}