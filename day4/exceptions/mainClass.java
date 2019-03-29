import java.sql.SQLException;
public class mainClass
{
	public static void main(String args[]) throws userDefinedException
	{
		try
		{
			testException.testMethod1();
		}
		catch (userDefinedException e)
		{
			System.out.println("Exception is handled in main");
		}

		testException.testMethod2();
		try
		{
			testException.testMethod3();
		}
		catch (SQLException e)
		{
			System.out.println("Sql Exception is handled in main");
		}	
	}
}