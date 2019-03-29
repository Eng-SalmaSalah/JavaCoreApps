import java.lang.reflect.*;
class Reflection
{
public static void main(String args[])
{
	Annotations obj=new Annotations();
	try
	{
		Class<?> c=obj.getClass();
		Method m=c.getMethod("printValue");
		Constructor constructor=c.getConstructor();
		//Field f=c.getField("x");
		Author annotationClass=c.getAnnotation(Author.class);
		Author annotationMethod=m.getAnnotation(Author.class);
		Author annotationConstructor=(Author)constructor.getAnnotation(Author.class);
		//Author annotationField=f.getAnnotation(Author.class);
		System.out.println(annotationClass.authorName());
		System.out.println(annotationMethod.authorName());
		System.out.println(annotationConstructor.authorName());
		//System.out.println(annotationField.authorName());
		
	}
	catch(Exception e) 
	{
		System.out.println("Failed");
	}
	
}
}