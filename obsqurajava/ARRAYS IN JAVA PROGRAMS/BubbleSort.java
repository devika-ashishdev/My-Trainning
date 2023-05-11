class BubbleSort {
public static void main(String args[]) {
int a[];
a=new int[5];
a[0]=3;
a[1]=8;
a[2]=1;
a[3]=6;
a[4]=5;
int temp;
int n=a.length;
System.out.println("Array elements before sorting: ");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length-1;j++)
{
if(a[j]>a[j+1])
{

temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}}
System.out.println("Array elements after sorting: ");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}}}
