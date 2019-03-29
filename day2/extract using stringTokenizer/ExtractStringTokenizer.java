import java.util.StringTokenizer;
import java.util.ArrayList;
public class ExtractStringTokenizer
{
public static void main(String args[])
{
	int wordsCounter=0;
	String inputStr=args[0];
	ArrayList<String> words = new ArrayList<String>();
	StringTokenizer stringtokenizer=new StringTokenizer(inputStr," ");
	while(stringtokenizer.hasMoreTokens())
	{
		words.add(stringtokenizer.nextToken());
	}
	for(int count=0;count<words.size();count++)
	{
		if(words.get(count).equals(args[1]))
			wordsCounter++;
	}
	System.out.println("Number of repeations: "+wordsCounter);
}
}
