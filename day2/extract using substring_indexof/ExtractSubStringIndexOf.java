import java.util.ArrayList;
public class ExtractSubStringIndexOf
{
public static void main(String args[])
{
	String inputStr=args[0];
	String wordToFind=args[1];
	ArrayList<String> words = new ArrayList<String>();
	int wordSize=wordToFind.length();
	int location=inputStr.indexOf(wordToFind);
	int counter=0;
	while(location>=0)
	{	
		words.add(inputStr.substring(location,location+wordSize));
		location=inputStr.indexOf(wordToFind,location+wordSize);	
	}
	System.out.println("Number of repeations: "+words.size());
	
	
}
}