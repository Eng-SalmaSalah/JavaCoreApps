package convert;
import java.util.function.*;
public class ConvertTemp
{

public static void main (String args[])
{
	Double centigrate=Double.parseDouble(args[0]);
	Function<Double,Double> convert=(c)->{return c*1.80+32;};
	Double fahrenhiet=convert.apply(centigrate);
	System.out.println("temprature in fahrenhiet is:" +fahrenhiet);
}
}