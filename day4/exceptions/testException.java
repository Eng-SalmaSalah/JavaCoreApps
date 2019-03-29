import java.sql.SQLException;
public class testException
{
	public static void testMethod1 () throws userDefinedException
	{
		throw new userDefinedException();	
	}

	public static void testMethod2 () 
	{
		try
		{
			throw new userDefinedException();
		}
		catch (userDefinedException e)
		{
			System.out.println("Exception is caught in the method");
		}
	}

	public static void testMethod3 () throws SQLException
	{
		try
		{
			throw new userDefinedException();
		}
		catch (userDefinedException e)
		{
			throw new SQLException();
		}	
	}
}