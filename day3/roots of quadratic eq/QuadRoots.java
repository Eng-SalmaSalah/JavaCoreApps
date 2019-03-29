import java.util.function.*;
import java.lang.Math;
public class QuadRoots
{
public static void main(String args[])
{
	Double a,b,c;
	a=Double.parseDouble(args[0]);
	b=Double.parseDouble(args[1]);
	c=Double.parseDouble(args[2]);
	Double array[]={a,b,c};
	Consumer<Double[]> calcRoot=(arr)->
	{
		Double sqRoot;
		Double discriminant=(Math.pow(b,2))-(4*a*c);
		Double root1=0.0,root2=0.0,realPart=0.0,imagPart=0.0;
		if(discriminant==0)
		{
			sqRoot=0.0;
			root1=-b/(2*a);
			System.out.println("Root is:" +root1);
		}
		if(discriminant>0)
		{
			sqRoot=Math.sqrt(discriminant);
			root1=((-b)/(2*a))+(sqRoot/(2*a));
			root2=((-b)/(2*a))-(sqRoot/(2*a));
			System.out.println("First Root is:" +root1);
			System.out.println("Second Root is:" +root2);
		}
		if(discriminant<0)
		{
			realPart=(-b)/(2*a);
			sqRoot=Math.sqrt(Math.abs(discriminant));
			imagPart= sqRoot/(2*a);
			System.out.println("First Root is:" + realPart + "+" + imagPart +"i");
			System.out.println("Second Root is:" +realPart + "-" + imagPart +"i");
		}	
	};
	calcRoot.accept(array);
	 
}

}