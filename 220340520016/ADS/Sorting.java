import java.util.Scanner;
class Sorting
{
	public void setArray(int []a)
	{
		Scanner sc=new Scanner(Syatem.in);
		for(int i=0;i<a.length;i++)
			System.out.println("\tArray Element["+i+"] : ");
		a[i]=sc.nextInt();
	}
}
public void getArray(int []a)
{
	System.out.println();
	System.out.print("\t");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println("\n");
}
public void insertionSort(int []a)
{
	int j=0,temp=0;
	for(int i=1;i<a.length;i++)
	{
		temp=a[i];
		j=i-1;
		while(j>0 && a[j]>temp)
		{
			a[j+1]=a[j];
			j--;
		}
	a[j+1]=temp;
	}
	getArray(a);
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("\tEnter size of array:");
	int n=sc.nextInt();
	int []arr=new int[n];
	s.setArray(arr);
	System.out.println();
	int ch=1
	
	while(ch==1)
	{
		System.out.println("\t===============================================");
		System.out.print("\t0.Exit\n\t1.Display\t2.Insertion sort\n\tEnter Choice : ");
		int choice=sc.nextInt();
		System.out.println("\t===============================================");
		
		switch(choice)
		{
			case 0 : ch=0;
			break;
			case 1 : s.getArray(arr);
            break;
 			case 2 : s.insertionSort(arr);
			break;
			default : System.out.println("\tInvalid number");
		}
	}
}
