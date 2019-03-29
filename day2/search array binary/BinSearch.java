import java.util.Random;
public class BinSearch
{
public static void main(String args[])
{
	long runTimeBefore=0,runTimeAfter=0;
	int n=300000;
	int arr[]=new int[n];
	Random r=new Random();
	for(int i=0;i<n;i++)
	{
		arr[i] = r.nextInt(n);
	}

	int i,j,min;
		for(i=0;i<(n-1);i++)
		{
			min=i;
			for(j=(i+1);j<n;j++)
			{
				if(arr[j]<arr[min])min=j;
			}
			if(i!=min)
			{
				int temp;
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;	
			}
		}
	int high=n-1,low=0,mid=0;
	int num=arr[5];
	boolean found=false;
	runTimeBefore=System.currentTimeMillis();
	while( (!found) && (low<=high))
	{
		mid=(high+low)/2;
		if(arr[mid] > num)
		{
			high=mid-1;
		}
		else if(arr[mid] < num)
		{
			low=mid+1;
		}
		else
		{
			found=true;
		}
	}
	
	runTimeAfter=System.currentTimeMillis();

	if(found)
	{
		System.out.println("Key is found at:" +mid);
	}
	else
	{
		System.out.println("not found!");
	}
	System.out.println("Time is: "+(runTimeAfter-runTimeBefore));

}
}