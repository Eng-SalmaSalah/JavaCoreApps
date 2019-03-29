import java.util.function.Predicate;
import java.lang.*;
public class StringCheck
{
public static boolean check(String word,Predicate<Character> p)
{
	char[]ch=word.toCharArray();
	for (char c : ch)
	{ 
		if(!p.test(c))
		{	
			return false;
		}
	}
return true;
} 

public static void main (String args[])
{
	String testString="java22@1";
	System.out.println(check(testString,Character::isLetter));
	
}
}