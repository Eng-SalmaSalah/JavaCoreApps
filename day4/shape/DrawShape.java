import java.util.*;
public class DrawShape
{

public static void drawPicture(ArrayList<? extends Shape> shapes)
{

	for(Shape s:shapes)
		s.drawShape();
}
			

public static void main (String args[])
{
	List<Shape> shapes =new ArrayList<Shape>();
	Rectangle rect=new Rectangle();
	Circle circle=new Circle();
	shapes.add(rect);
	shapes.add(circle);
	drawPicture(shapes);
	
}
}