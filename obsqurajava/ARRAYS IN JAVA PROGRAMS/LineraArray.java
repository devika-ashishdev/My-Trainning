class LineraArray {
public static void main(String args[]) {
int a[]={10,20,30,40,50};
int size=a.length;
int value=30;
int flag=0;

for(int i=0;i<size;i++)
{
if(a[i]==value)
{
flag++;
}
}
if(flag>0)

{
System.out.println("element found in array at:"+value);
}
else
{
System.out.println("element not found in array");
}
}
}
