


public class arraySum
{

public static void main(String args[])
{
int i=0,j=0,a[]={1,7,8,9,17,25,26,33,40}; int count=0;


for(i=0;i<9;i++)
{

for(j=i+1;j<a.length-1;j++)
{

System.out.println(+ a[i]+" "+a[j] + " ");


if((a[i]+a[j])==a[j+1])
{

count++;
}
}

}
System.out.println("SUM : "+count);

}
}