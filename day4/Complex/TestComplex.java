import java.math.BigDecimal;

class TestComplex
{
	public static void main(String args[])
	{
		Complex<BigDecimal, BigDecimal> complex1 = new Complex<>();
		complex1.setReal(new BigDecimal(5));
		complex1.setImg(new BigDecimal(10));
		Complex<BigDecimal, BigDecimal> complex2 = new Complex<>();
		complex2.setReal(new BigDecimal(7));
		complex2.setImg(new BigDecimal(14));
		System.out.println(complex1.getMagnitude());
		Complex<BigDecimal, BigDecimal> complex3 = new Complex<>();
		complex3 = complex1.add(complex2);
		Complex<BigDecimal, BigDecimal> complex4 = new Complex<>();
		complex4 = complex1.subtract(complex2);
		System.out.println(complex3.getReal() + " " + complex3.getImg());
		System.out.println(complex4.getReal() + " " + complex4.getImg());
	}
}