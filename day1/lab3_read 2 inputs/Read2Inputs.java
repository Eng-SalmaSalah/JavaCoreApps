public class Read2Inputs
{
public static void main(String args[]){
	if(args.length==2)
	{
		int numofprints;
		numofprints=Integer.parseInt(args[0]);
		for(int i=0;i<numofprints;i++)
			System.out.println(args[1]);
	}
	else
	{
		System.out.println("enter number of prints then the text to print");
	}
		
}
}