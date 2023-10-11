public class Matrix
{

public static void main(String args[])
{


int i=0,j=0,a[][]=new int[4][5]; int k=1;



//Values are added in the array
for(i=0;i<4;i++)
{

for(j=0;j<5;j++)
{
a[i][j]=k;
k++;
}
}

//Dispaly of the array in matrix form

System.out.println("The matrix in spiral form is ");

for(i=0;i<4;i++)
{
System.out.println(a[i][0]);
}


for(j=0;j<4;j++)
{
System.out.println(a[j][1]);
}

for(i=0;i<4;i++)
{
System.out.println(a[i][2]);
}


for(j=0;j<4;j++)
{
System.out.println(a[j][3]);
}

for(i=0;i<4;i++)
{
System.out.println(a[i][4]);
}


System.out.println("The program ends here ");
}
}