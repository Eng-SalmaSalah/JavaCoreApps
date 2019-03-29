import java.util.Random;
public class SeqSearch
{
public static void main(String args[])
{
	long runTimeBefore=0,runTimeAfter=0;
	int max,min;
	int n=300000;
	int arr[]=new int[n];
	Random r=new Random();
	for(int i=0;i<n;i++)
	{
		arr[i] = r.nextInt(n);
	}
	
	max=arr[0];
	min=arr[0];
	runTimeBefore=System.currentTimeMillis();
	for(int i=0;i<n;i++)
	{
		if(arr[i]>max)
			max=arr[i];
	}
	for(int i=0;i<n;i++)
	{
		if(arr[i]<min)
			min=arr[i];
	}
	runTimeAfter=System.currentTimeMillis();
	System.out.println("Max number is: "+max);
	System.out.println("Min number is: "+min);
	System.out.println("Time is: "+(runTimeAfter-runTimeBefore));
}
}