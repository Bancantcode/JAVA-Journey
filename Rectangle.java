public class Rectangle
{
    	private double length, width;

    	public double area(double length, double width)
    	{
        	double area = 0;
			area = length * width;
			return area;
    	}

    	public double perimeter(double length, double width)
    	{
    		double perimeter = 0;
			perimeter = 2 * (length * width);
			return perimeter;
    	}  
}

