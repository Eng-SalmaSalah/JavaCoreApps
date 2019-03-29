import java.util.regex.*;
public class ExtractRegEx
{
public static void main (String args[])
{
	int wordsCounter=0;
	String inputStr=args[0];
	String wordToFind=args[1];
	Pattern pattern=Pattern.compile("\\b"+wordToFind+"\\b");  //convert pattern string to pattern object to match with it,has no constructor,compile is used and it is static method 
 	Matcher matcher=pattern.matcher(inputStr);  //Matcher performs match operations on a string by comparing to a Pattern,a matcher is created from a pattern by invoking the pattern's matcher method.
	while(matcher.find()) 
	{
        	wordsCounter++;
	}
	System.out.println("Number of repeations: "+wordsCounter);
}
}