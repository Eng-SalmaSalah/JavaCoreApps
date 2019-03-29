import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author
{
	String authorName ();
}

@Author(authorName="SalmaClass")
public class Annotations
{
	@Author(authorName="Salma")
	int x;

	@Author(authorName="SalmaConstructor")
	public Annotations()
	{
		x=6;
	}

	@Author(authorName="SalmaMethod")
	public void printValue ()
	{		
		System.out.println("the value is:" + x);
	}
}