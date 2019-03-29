public class ExtractSplit
{
public static void main(String args[])
{
	int wordsCounter=0;
	String inputStr=args[0];
	String[]arrayOfWords=inputStr.split(" ");
	for(int count=0;count<arrayOfWords.length;count++)
	{
		if(arrayOfWords[count].equals(args[1]))
			wordsCounter++;
	}
	System.out.println("Number of repeations: "+wordsCounter);
}
}