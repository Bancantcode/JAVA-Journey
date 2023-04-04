public class Circle
{
    private double radius;
    final double PI = 3.1416;

// the following are methods
    public double area(double radius)
    {
        double area = 0;
	    area = PI * (radius*radius);
	    return area;
    }

    public double perimeter(double radius)
    {
    	double perimeter = 0;
	    perimeter = 2 * PI * radius;
	    return perimeter;
    }  
}