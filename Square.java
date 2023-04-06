public class Square
{
    	private double side;

    	public double area(double side)
    	{
        	double area = 0;
			area = side * side;
			return area;
    	}

    	public double perimeter(double side)
    	{
    		double perimeter = 0;
			perimeter = 4 * side;
			return perimeter;
    	}  
}

