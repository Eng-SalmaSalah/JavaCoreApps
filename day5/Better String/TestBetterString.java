public class TestBetterString
{
public static String betterString(String s1,String s2,BetterString b)
{
	return b.selectBetterString(s1,s2);	
} 

public static void main (String args[])
{
	String firstString="java";
	String secondString="salma";
	BetterString compare = (s1,s2)->{
	if(s1.length()<s2.length())
		return s1;
	else
		return s2;
	};
	System.out.println(betterString(firstString,secondString,compare));
	
}
}