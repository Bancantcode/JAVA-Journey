public class Triangle
{
    	private double base, height, side;

    	public double area(double base, double height)
    	{
        	double area = 0;
			area = (base * height) / 2;
			return area;
    	}

    	public double perimeter(double base, double height, double side)
    	{
    		double perimeter = 0;
			perimeter = side + base + side;
			return perimeter;
    	}  
}

