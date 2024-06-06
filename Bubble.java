import java.util.*;
class Bubble
{
public static void bubbleSort(int array[])
{

for(int i=0;i<array.length-1;i++)
{
boolean flag=false;
for(int j=0;j<array.length-1-i;j++)
{
if(array[j]<array[j+1])
{
int temp=array[j];
array[j]=array[j+1];
array[j+1]=temp;
flag=true;
}
}
if(flag==false)
{
break;
}

}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int array[]=new int[size];
for(int i=0;i<size;i++)
{
array[i]=sc.nextInt();
}
bubbleSort(array);
System.out.println("sorted array");
for(int j=0;j<size;j++)
{
System.out.println(array[j]);
}
}
}