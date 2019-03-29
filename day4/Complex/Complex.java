
import java.math.BigDecimal;
import java.math.MathContext;

class Complex<T extends BigDecimal, R extends BigDecimal>
{
	private T real;
	private R img;

	Complex()
	{
		real = null;
		img = null;
	}

	public T getReal()
	{
		return real;
	}
	
	public void setReal(T realPart)
	{
		real = realPart;
	}

	public R getImg()
	{
		return img;
	}
	
	public void setImg(R imgPart)
	{
		img = imgPart;
	}

	public BigDecimal getMagnitude()
	{
		return (real.multiply(real).add(img.multiply(img))).sqrt(MathContext.DECIMAL64);
	}

	public Complex<BigDecimal, BigDecimal> add(Complex<BigDecimal, BigDecimal> c)
	{
		BigDecimal realResult = this.real.add(c.getReal());
		BigDecimal imgResult = this.img.add(c.getImg());
		Complex<BigDecimal, BigDecimal> result = new Complex<BigDecimal, BigDecimal>();
		result.real = realResult;
		result.img = imgResult;
		return result;
	}

	public Complex<BigDecimal, BigDecimal> subtract(Complex<BigDecimal, BigDecimal> c)
	{
		BigDecimal realResult = this.real.subtract(c.getReal());
		BigDecimal imgResult = this.img.subtract(c.getImg());
		Complex<BigDecimal, BigDecimal> result = new Complex<BigDecimal, BigDecimal>();
		result.real = realResult;
		result.img = imgResult;
		return result;
	}
}